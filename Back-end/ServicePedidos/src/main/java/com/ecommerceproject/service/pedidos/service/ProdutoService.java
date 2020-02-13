package com.ecommerceproject.service.pedidos.service;

import java.util.ArrayList;
import java.util.List;

import com.ecommerceproject.service.pedidos.model.Produto;
import com.ecommerceproject.service.pedidos.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto createProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> createProdutos(List<Produto> produtos) {

        Iterable<Produto> produtosIterable = produtoRepository.saveAll(produtos);
        List<Produto> insertedProdutos = new ArrayList<Produto>();

        produtosIterable.forEach(insertedProdutos::add);

        return insertedProdutos;
    }
}