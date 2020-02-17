package com.ecommerceproject.service.pedidos.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.ecommerceproject.service.pedidos.constants.MessagesPortuguese;

/**
 * PedidoDTO
 */
public class PedidoDTO implements Serializable {

	private static final long serialVersionUID = 935893008236006008L;

	private Integer idPedido;

    @NotNull(message = MessagesPortuguese.MESSAGE_CLIENTE_REQUIRED)
    private String clientId;
    
    @NotNull(message = MessagesPortuguese.TOTAL_ITENS_REQUIRED)
    private int totalItens;
    
    @NotNull(message = MessagesPortuguese.TOTAL_PRECO_FRETE_REQUIRED)
    private Double totalPrecoFrete;
    
    @NotNull(message = MessagesPortuguese.TOTAL_PRECO_REQUIRED)
    private Double totaPrecoPedido;

    @NotNull
    private Double totalPrecoSemFrete;
    
    @NotNull(message = MessagesPortuguese.PRODUTOS_REQUIRED)
    @NotEmpty(message = MessagesPortuguese.PRODUTOS_REQUIRED)
    private List<ProdutoDTO> produtos;


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

    public Double getTotaPrecoPedido() {
        return totaPrecoPedido;
    }

    public void setTotaPrecoPedido(Double totaPrecoPedido) {
        this.totaPrecoPedido = totaPrecoPedido;
    }

    public Double getTotalPrecoSemFrete() {
        return totalPrecoSemFrete;
    }

    public void setTotalPrecoSemFrete(Double totalPrecoSemFrete) {
        this.totalPrecoSemFrete = totalPrecoSemFrete;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
}