package com.guilherme.ApiProduto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;

    @Column(name="Código", nullable = false)
    private String codigoProduto;

    @Column(name="Nome", nullable = false)
    private String nomeProduto;

    @Column(name="Quantidade", nullable = false)
    private double quantidade;

    @Column(name="Marca", nullable = false)
    private String marca;

    @Column(name="Categoria", nullable = false)
    private String categoria;



}