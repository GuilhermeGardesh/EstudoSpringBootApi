package com.guilherme.ApiProduto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Produtos")
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="código", nullable = false)
    private String codigoProduto;

    @Column(name="nome", nullable = false)
    private String nomeProduto;

    @Column(name="quantidade", nullable = false)
    private int quantidade;

    @Column(name="marca", nullable = false)
    private String marca;

    @Column(name="categoria", nullable = false)
    private String categoria;

    //Get e Set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}