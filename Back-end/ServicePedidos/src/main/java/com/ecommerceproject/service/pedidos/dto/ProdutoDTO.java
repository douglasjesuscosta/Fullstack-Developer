package com.ecommerceproject.service.pedidos.dto;

import java.io.Serializable;

/**
 * ProdutoDTO
 */
public class ProdutoDTO implements Serializable {


    private static final long serialVersionUID = -4265598421601584441L;
    
    private Integer id;
    private String codigo;
    private String nome;
    private Double precoUnitario;
    private int quantidade;


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

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}