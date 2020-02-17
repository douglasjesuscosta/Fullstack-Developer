package com.ecommerceproject.service.pedidos.repository;

import com.ecommerceproject.service.pedidos.model.Pedido;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * PedidoRespository
 * 
 * Repository referente a entidade {@link Pedido}
 */
@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long>{

    
}