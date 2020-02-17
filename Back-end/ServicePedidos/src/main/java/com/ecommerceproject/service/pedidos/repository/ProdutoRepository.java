package com.ecommerceproject.service.pedidos.repository;

import com.ecommerceproject.service.pedidos.model.Produto;

import org.springframework.data.repository.CrudRepository;

/**
 * ProdutoRepository
 * 
 * Respositório referente a entidade {@link Produto}
 */
public interface ProdutoRepository extends CrudRepository<Produto, Long> { }