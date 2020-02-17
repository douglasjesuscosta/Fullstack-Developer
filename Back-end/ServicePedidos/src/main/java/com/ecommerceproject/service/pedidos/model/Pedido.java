package com.ecommerceproject.service.pedidos.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
 * Pedido
 */
@Entity
@Table(name="pedidos")
public class Pedido {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name="clientId")
    private String clientId;

    @NotNull
    @Column(name = "totalItens")
    private int totalItens;

    @NotNull
    @Column(name = "totalPrecoFrete")
    private Double totalPrecoFrete;

    @NotNull
    @Column(name = "totalPrecoPedido")
    private Double totaPrecolPedido;

    @NotNull
    @NotEmpty
    @OneToMany(fetch = FetchType.LAZY)
    private List<Produto> produtos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getTotalPrecoFrete() {
        return totalPrecoFrete;
    }

    public void setTotalPrecoFrete(Double totalPrecoFrete) {
        this.totalPrecoFrete = totalPrecoFrete;
    }

    public Double getTotaPrecolPedido() {
        return totaPrecolPedido;
    }

    public void setTotaPrecolPedido(Double totaPrecolPedido) {
        this.totaPrecolPedido = totaPrecolPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}