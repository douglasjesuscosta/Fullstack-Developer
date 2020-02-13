package com.ecommerceproject.service.pedidos.mapper;

import java.util.ArrayList;
import java.util.List;

import com.ecommerceproject.service.pedidos.dto.PedidoDTO;
import com.ecommerceproject.service.pedidos.model.Pedido;
import com.ecommerceproject.service.pedidos.model.Produto;

/**
 * PedidoMapper
 */
public class PedidoMapper {

    public static Pedido toPedido(final PedidoDTO pedidoDTO) {

        final Pedido pedido = new Pedido();

        pedido.setClientId(pedidoDTO.getClientId());
        pedido.setTotalItens(pedidoDTO.getTotalItens());
        pedido.setTotalPrecoFrete(pedidoDTO.getTotalPrecoFrete());
        pedido.setTotaPrecolPedido(pedidoDTO.getTotaPrecoPedido());

        List<Produto> produtos = new ArrayList();
        pedidoDTO.getProdutos().stream().forEach( produtoDTO -> {
            final Produto produto = ProdutoMapper.toProduto(produtoDTO);
            produtos.add(produto);
        });
        pedido.setProdutos(produtos);
        return pedido;
    }

    public static PedidoDTO toPedidoDTO(final Pedido pedido) {

        final PedidoDTO pedidoDTO = new PedidoDTO();

        pedidoDTO.setClientId(pedido.getClientId());
        pedidoDTO.setTotalItens(pedido.getTotalItens());
        pedidoDTO.setTotalPrecoFrete(pedido.getTotalPrecoFrete());
        pedidoDTO.setTotaPrecoPedido(pedido.getTotaPrecolPedido());

        return pedidoDTO;
    }
}