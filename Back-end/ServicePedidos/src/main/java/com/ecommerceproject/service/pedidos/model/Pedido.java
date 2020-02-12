package com.ecommerceproject.service.pedidos.model;

import java.util.List;

/**
 * Pedido
 */
public class Pedido {
    
    private Long id;
    private String clientId;
    private int totalItens;
    private Long totalPrecoFrete;
    private Long totaPrecolPedido;
    private List<Produto> produtos;

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

    public Long getTotaPrecolPedido() {
        return totaPrecolPedido;
    }

    public void setTotaPrecolPedido(Long totaPrecolPedido) {
        this.totaPrecolPedido = totaPrecolPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}