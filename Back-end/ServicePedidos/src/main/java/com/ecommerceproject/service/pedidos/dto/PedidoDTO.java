package com.ecommerceproject.service.pedidos.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.ecommerceproject.service.pedidos.constants.MessagesPortuguese;

/**
 * PedidoDTO
 */
public class PedidoDTO {

    private Long idPedido;

    @NotNull(message = MessagesPortuguese.MESSAGE_CLIENTE_REQUIRED)
    private String clientId;
    
    @NotNull(message = MessagesPortuguese.TOTAL_ITENS_REQUIRED)
    private int totalItens;
    
    @NotNull(message = MessagesPortuguese.TOTAL_PRECO_FRETE_REQUIRED)
    private Long totalPrecoFrete;
    
    @NotNull(message = MessagesPortuguese.TOTAL_PRECO_REQUIRED)
    private Long totaPrecoPedido;
    
    @NotNull(message = MessagesPortuguese.PRODUTOS_REQUIRED)
    @NotEmpty(message = MessagesPortuguese.PRODUTOS_REQUIRED)
    private List<ProdutoDTO> produtos;

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(int totalItens) {
        this.totalItens = totalItens;
    }

    public Long getTotalPrecoFrete() {
        return totalPrecoFrete;
    }

    public void setTotalPrecoFrete(Long totalPrecoFrete) {
        this.totalPrecoFrete = totalPrecoFrete;
    }

    public Long getTotaPrecoPedido() {
        return totaPrecoPedido;
    }

    public void setTotaPrecoPedido(Long totaPrecoPedido) {
        this.totaPrecoPedido = totaPrecoPedido;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}