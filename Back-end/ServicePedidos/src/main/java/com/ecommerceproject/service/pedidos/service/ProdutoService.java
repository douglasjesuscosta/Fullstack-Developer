package com.ecommerceproject.service.pedidos.service;

import java.util.ArrayList;
import java.util.List;

import com.ecommerceproject.service.pedidos.model.Produto;
import com.ecommerceproject.service.pedidos.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 * 
 * Service referente a concentração de regras de negócio e
 * orquestração de fluxos relacionados a {@link Produto}.
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Método que orquestra o fluxo para insersão de
     * um produto.
     * 
     * @param produto
     */
    public Produto createProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    /**
     * Método que orquestra o fluxo de criação de uma 
     * lista de {@link Produto}.
     * 
     * @param produtos
     * @return
     */
    public List<Produto> createProdutos(List<Produto> produtos) {

        Iterable<Produto> produtosIterable = produtoRepository.saveAll(produtos);
        List<Produto> insertedProdutos = new ArrayList<Produto>();

        produtosIterable.forEach(insertedProdutos::add);

        return insertedProdutos;
    }
}