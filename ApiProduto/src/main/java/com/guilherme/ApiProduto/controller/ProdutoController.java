package com.guilherme.ApiProduto.controller;

import com.guilherme.ApiProduto.model.Produto;
import com.guilherme.ApiProduto.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProdutoController {

    @Autowired
    private final ProdutoRepository produtoRepository;

    //Listar produtos
    @GetMapping("/produtos")
    public @ResponseBody List<Produto> list(){
        return produtoRepository.findAll();
    }

    //cadastrar produtos
    @PostMapping("/produtos")
    public @ResponseBody Produto cadastrar(@RequestBody Produto produto){

        return produtoRepository.save(produto);
    }


    //Alterar Informações
    @PutMapping("/produtos")
    public @ResponseBody Produto Alterar(@RequestBody Produto produto){

        return produtoRepository.save(produto);
    }


    //Filtrar por Id
    @GetMapping("/produtos/{id}")
    public @ResponseBody Produto filtrarPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }


    //Deletar
    @DeleteMapping("/produtos/{id}")
    public @ResponseBody void remover(@PathVariable int id){
        Produto produto = filtrarPorId(id);
        this.produtoRepository.delete(produto);
    }

}
