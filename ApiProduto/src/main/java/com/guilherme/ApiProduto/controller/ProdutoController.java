package com.guilherme.ApiProduto.controller;

import com.guilherme.ApiProduto.model.Produto;
import com.guilherme.ApiProduto.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@AllArgsConstructor
public class ProdutoController {

    @Autowired
    private final ProdutoRepository produtoRepository;


    @GetMapping("/lista")
    public List<Produto> list(){
        return produtoRepository.findAll();
    }
}
