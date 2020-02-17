package com.ecommerceproject.service.pedidos.mapper;

import java.util.ArrayList;
import java.util.List;

import com.ecommerceproject.service.pedidos.dto.PedidoDTO;
import com.ecommerceproject.service.pedidos.model.Pedido;
import com.ecommerceproject.service.pedidos.model.Produto;

/**
 * PedidoMapper
 * 
 * Classe referente a conversão da entidade {@link Pedido}
 * para {@link PedidoDTO} 
 */
public class PedidoMapper {

    /**
     * Converte {@link PedidoDTO} para {@link Pedido}
     * 
     * @param pedidoDTO
     * @return pedido
     */
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

    /**
     * Converte {@link Pedido} para {@link PedidoDTO}
     * 
     * @param pedido
     * @return pedidoDTO
     */
    public static PedidoDTO toPedidoDTO(final Pedido pedido) {

        final PedidoDTO pedidoDTO = new PedidoDTO();

        pedidoDTO.setIdPedido(pedido.getId());
        pedidoDTO.setClientId(pedido.getClientId());
        pedidoDTO.setTotalItens(pedido.getTotalItens());
        pedidoDTO.setTotalPrecoFrete(pedido.getTotalPrecoFrete());
        pedidoDTO.setTotaPrecoPedido(pedido.getTotaPrecolPedido());

        return pedidoDTO;
    }
}