package com.ecommerceproject.service.pedidos.dto;

/**
 * ProdutoDTO
 */
public class ProdutoDTO {

    private Long id;
    private String codigo;
    private String nome;
    private Long precoUnitario;
    private int quantidade;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Long precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}