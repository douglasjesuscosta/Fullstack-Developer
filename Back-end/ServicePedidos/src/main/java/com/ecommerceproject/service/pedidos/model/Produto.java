package com.ecommerceproject.service.pedidos.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Produto
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column(name = "quantidadeComprada")
    private int quantidadeComprada;

    @NotNull
    @Column(name = "valorUnitario")
    private Long valorUnitario;

}