package com.ecommerceproject.service.pedidos.mapper;

import com.ecommerceproject.service.pedidos.dto.ProdutoDTO;
import com.ecommerceproject.service.pedidos.model.Produto;

/**
 * ProdutoMapper
 */
public class ProdutoMapper {

    public static Produto toProduto(ProdutoDTO produtoDTO){

        Produto produto = new Produto();

        produto.setId(produtoDTO.getId());
        produto.setQuantidadeComprada(produtoDTO.getQuantidade());
        produto.setValorUnitario(produtoDTO.getPrecoUnitario());
        produto.setNome(produtoDTO.getNome());
        produto.setCodigoProduto(produtoDTO.getCodigo());

        return produto;
    }

    public static ProdutoDTO toProdutoDTO(Produto produto){

        ProdutoDTO produtoDTO = new ProdutoDTO();

        produtoDTO.setId(produto.getId());
        produtoDTO.setQuantidade(produto.getQuantidadeComprada());
        produtoDTO.setPrecoUnitario(produto.getValorUnitario());
        produtoDTO.setNome(produto.getNome());
        produtoDTO.setCodigo(produto.getCodigoProduto());

        return produtoDTO;
    }


}