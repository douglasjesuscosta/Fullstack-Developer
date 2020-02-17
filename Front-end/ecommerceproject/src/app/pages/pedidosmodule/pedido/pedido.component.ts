import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormArray } from '@angular/forms'

import { Pedido } from 'src/model/pedido';
import { Produto } from 'src/model/produto';
import { PedidoClientService } from '../pedido-client.service';
import { ClientFreteService } from '../../shared/clientfrete.service';


@Component({
  selector: 'app-pedido',
  templateUrl: './pedido.component.html',
  styleUrls: ['./pedido.component.css']
})

/**
 * Componente referente a criação de um pedido.
 */
export class PedidoComponent implements OnInit {

  get produtosSelecionados() { return <FormArray>(this.pedidoForm.get('produtos')); }

  ngOnInit() {
  }

  public pedidoForm: FormGroup;

  public clientes: [];
  public produtos: [];
  public pedido: Pedido;

  /**
   * Construtor do componente
   */
  constructor(
    private pedidoClientService: PedidoClientService,
    private clientFrete: ClientFreteService,
    private formBuilder: FormBuilder,
    private route: ActivatedRoute
  ) {
    const produtosClientes = route.snapshot.data["pedidosClientens"];

    this.clientes = produtosClientes && produtosClientes.clientes;
    this.produtos = produtosClientes && produtosClientes.produtos;

    this.pedido = new Pedido();
    this.pedidoForm = this.formBuilder.group({
      clientId: [null, Validators.required],
      produtoSelector: [null],
      produtos: this.formBuilder.array([]),
      frete: [0],
      totalItens: [0],
      totalPrecoSemFrete: [0],
      totalPedido: [0]
    })

    this.monitorarSelecaoProduto();
  }

  /**
   * Método que inicia o fluxo de adição de um produto 
   * ao formulário.
   */
  public addProductToForm = (produto) => {

    if(produto) {
      let novoProdutoControl = this.createProductFromControl(produto);
      let arrayProdutos = this.pedidoForm.get('produtos') as FormArray;
      arrayProdutos.controls.push(novoProdutoControl);
    }

    this.recalcularValoresPedido();
  }

  /**
   * Método que cria um formulário (FormArray) de produto inicializando
   * alguns de seus valores.
   */
  private createProductFromControl = (produto):FormGroup => {

    let productFormControl = produto && this.formBuilder.group({
      id: [null],
      codigo: [produto.codigo],
      nome: [produto.nome],
      precoUnitario: [produto.precoUnitario],
      quantidade: [1, [Validators.min(1)]],
      total: [produto.precoUnitario],
      imageProduct: `./../../../assets/icones/${produto.codigo}.jpg`
    })

    return productFormControl;
  }

  /**
   * Método que realiza a atualização dos valores referentes ao 
   * pedido mediante modificações nos itens.
   */
  public recalcularValoresPedido = () => {
    let totalProdutos = 0, quantidadeTotalItens = 0;

    this.produtosSelecionados && this.produtosSelecionados.controls.forEach( (produtoGroup) => {
      let totalItemCompra = produtoGroup.get('precoUnitario').value * produtoGroup.get('quantidade').value;
      produtoGroup.get('total').setValue(totalItemCompra);

      quantidadeTotalItens += produtoGroup.get('quantidade').value;
      totalProdutos += totalItemCompra;
    })
    this.pedidoForm.get('totalPrecoSemFrete').setValue(totalProdutos)
    this.pedidoForm.get('totalItens').setValue(quantidadeTotalItens);
    this.pedidoForm.get('totalPedido').setValue(totalProdutos);

    this.recalcularFrete(quantidadeTotalItens)
  }

  /**
   * Método que inica o fluxo de requisição para obter o valor 
   * do frete do serviço de cálculo do preço do frete
   */
  private recalcularFrete = (quantidadeItens: Number) => {
    this.clientFrete.getValorFrete(quantidadeItens).subscribe( 
      (frete) => {
        console.log(frete);
        this.pedidoForm.get('frete').setValue(frete);
      },
      (err) => {

      }
    )
  }

  /**
   * Método que monitora o preenchimento e seleção de produtos
   * inicializando o fluxo de adição e cálculo do valor total
   * do pedido.
   */
  private monitorarSelecaoProduto = () => {
    this.pedidoForm.get('produtoSelector').valueChanges.subscribe( (value) => {
      if(value) {
        this.addProductToForm(value);
        this.pedidoForm.get('produtoSelector').reset();
      }
    })
  }

  /**
   * Método que realiza a limpeza de itens do carrinho
   * atualizando também os valores.
   */
  public onClickLimparCarrinho = () => {
    this.pedidoForm.get('produtos').reset();
    this.pedidoForm.get('frete').setValue(0);
    this.pedidoForm.get('totalItens').setValue(0);
    this.pedidoForm.get('totalPedido').setValue(0);
  }

  /**
   * Método de auxílio que informa se foram selecionados produtos
   * para exibição do aviso.
   * 
   */
  public isProdutosSelecionadosEmpty = () => {
    return this.produtosSelecionados.controls.length === 0 ;
  }

  /**
   * Salva os dados de pedido.
   * 
   * */
  public salvar(): void {
    const pedido: Pedido = this.getPedidoToInsert();

    this.pedidoClientService.salvar(pedido).subscribe(() => {
      console.log("SUCESSO");
    }, error => {

    });
  }

  /**
   * Considerando os objetos que representam o formulário, esse método 
   * é acionado no fluxo de salvar para retornar o o objeto de pedido
   * com base nos valores do formulário.
   */
  private getPedidoToInsert = (): Pedido => {
    let pedidoToInsert = new Pedido();
    
    pedidoToInsert.$idPedido = null;
    pedidoToInsert.$clientId = this.pedidoForm.get('clientId').value;
    pedidoToInsert.$totalPrecoFrete = this.pedidoForm.get('frete').value;
    pedidoToInsert.$totaPrecoPedido = this.pedidoForm.get('totalPedido').value;
    pedidoToInsert.$totalItens = this.pedidoForm.get('totalItens').value;
    pedidoToInsert.$totalPrecoSemFrete = this.pedidoForm.get('totalPrecoSemFrete').value;

    pedidoToInsert.$produtos = this.getProdutosToInsert();

    return pedidoToInsert;
  }

  /**
   * Método de auxílio que retorna a lista de produtos para 
   * inserir a partir dos objetos de FormGroup no FormArray.
   * 
   */
  private getProdutosToInsert = () => {
    let produtosToInsert: Produto[] = [];

    this.produtosSelecionados.controls.forEach( produtoForm => {
      let produtoToInsert: Produto = new Produto();

      produtoToInsert.$codigo = produtoForm.get('codigo').value;
      produtoToInsert.$id = produtoForm.get('id').value;
      produtoToInsert.$nome = produtoForm.get('nome').value;
      produtoToInsert.$quantidade = produtoForm.get('quantidade').value;
      produtoToInsert.$precoUnitario = produtoForm.get('precoUnitario').value;

      produtosToInsert.push(produtoToInsert);
    });

    return produtosToInsert;
  }

  /**
   * Método acionado ao clicar no botão para remoção
   * de produtos do carrinho.
   */
  onRemoveItem = (index) => {

  }
}
