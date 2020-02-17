package com.ecommerceproject.service.pedidos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import com.ecommerceproject.service.pedidos.dto.PedidoDTO;
import com.ecommerceproject.service.pedidos.dto.ProdutoDTO;
import com.ecommerceproject.service.pedidos.service.PedidoService;

import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * PedidoController
 * 
 * Controller referente as operações relacionadas a
 * entidade de {@link Pedido}.
 */
@RestController
@RequestMapping("pedido")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    /**
     * Método para verificação da disponibilidade
     * do serviço.
     * 
     * @return
     */
    @GetMapping("/healthcheck")
    public String healthCheck() {
        return "Working";
    }

    /**
     * Método para retorno de todos os {@link PedidoDTO} 
     * cadastrados.
     */
    @GetMapping
    public List<PedidoDTO> getPedidos() {
        return pedidoService.getPedidos();
    }

    /**
     * Método para retorno de um {@link ProdutoDTO}
     * a partir de seu Id.
     * 
     * @param idProduto
     * @return
     */
    @GetMapping(path = "/{idPedido}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ProdutoDTO> getPedido(@PathVariable String idProduto) {
        return null;
    }

    /**
     * Método para a criação de pedidos.
     * 
     * @param pedidoDTO
     */
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PedidoDTO> createPedido(@Valid @RequestBody PedidoDTO pedidoDTO) {
        pedidoDTO = pedidoService.createPedido(pedidoDTO);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Método que da início ao fluxo de exclusão de pedido.
     * O método tem como parâmetro o id do pedido.
     * 
     * @param idPedido
     */
    @DeleteMapping(path = "/{idPedido}")
    public ResponseEntity<Integer> deletePedido() {
        return null;
    }
    
}