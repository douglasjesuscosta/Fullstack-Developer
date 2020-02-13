package com.ecommerceproject.service.pedidos.service;

import java.util.List;

import com.ecommerceproject.service.pedidos.dto.PedidoDTO;
import com.ecommerceproject.service.pedidos.mapper.PedidoMapper;
import com.ecommerceproject.service.pedidos.model.Pedido;
import com.ecommerceproject.service.pedidos.model.Produto;
import com.ecommerceproject.service.pedidos.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PedidoService
 */
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoService produtoService;

    public PedidoDTO createPedido(PedidoDTO pedidoDTO) {

        Pedido pedido = PedidoMapper.toPedido(pedidoDTO);
        List<Produto> produtos = produtoService.createProdutos(pedido.getProdutos());

        pedido.setProdutos(produtos);
        pedido = pedidoRepository.save(pedido);

        return PedidoMapper.toPedidoDTO(pedido);
    }

    public List<PedidoDTO> getPedidos() {
        return null;
    }

    public void deletePedido(Long idPedido) {
        
    }

    public PedidoDTO updatePedido(Long idPedido) {
        return null;
    }


}