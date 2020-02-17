package com.ecommerceproject.service.pedidos.service;

import java.util.ArrayList;
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
 * 
 * Service que concentra as regras de negócio referente
 * aos fluxos relacionados a {@link Pedido}.
 */
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoService produtoService;

    /**
     * Método que orquestra o fluxo de persistência de 
     * {@link Pedido} 
     * 
     * @param pedidoDTO
     */
    public PedidoDTO createPedido(PedidoDTO pedidoDTO) {

        Pedido pedido = PedidoMapper.toPedido(pedidoDTO);
        List<Produto> produtos = produtoService.createProdutos(pedido.getProdutos());

        pedido.setProdutos(produtos);
        pedido = pedidoRepository.save(pedido);

        return PedidoMapper.toPedidoDTO(pedido);
    }

    /**
     * Método que orquestra o fluxo de obtenção de 
     * todos os pedidos persistidos.
     * 
     * @return pedidosDTO
     */
    public List<PedidoDTO> getPedidos() {

        Iterable<Pedido> pedidosIterable = pedidoRepository.findAll();
        ArrayList<Pedido> pedidosList = new ArrayList<Pedido>();
        pedidosIterable.forEach(pedidosList::add);

        List<PedidoDTO> pedidosDTO = new ArrayList<PedidoDTO>();

        pedidosList.stream().forEach(pedido -> {
            PedidoDTO pedidoDTO = PedidoMapper.toPedidoDTO(pedido);
            pedidosDTO.add(pedidoDTO);
        });

        return pedidosDTO;

    }

    /**
     * Método que orquestra o fluxo de exclusão de {@link Pedido}
     * a partir de seu Id.
     * 
     * @param idPedido
     */
    public void deletePedido(Long idPedido) {
        
    }

    /**
     * Método que orquestra o fluxo de atualização de {@link Pedido}
     * 
     * @param idPedido
     * @return
     */
    public PedidoDTO updatePedido(Long idPedido) {
        return null;
    }
}