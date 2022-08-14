package com.guilherme.ApiProduto.repository;

import com.guilherme.ApiProduto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    //Criar e Editar
    <Prod extends Produto> Prod save(Prod Produto);

    //ListarTodos
    @Override
    List<Produto> findAll();

    //Deletar
    @Override
    void delete(Produto produto);

    //Mostrar por ID
    Produto findById(int id);






}
