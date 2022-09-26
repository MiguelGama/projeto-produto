package com.br.desafio.produtos.repository;

import com.br.desafio.produtos.enums.StatusProduto;
import com.br.desafio.produtos.model.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    @Query(value = "Select p from Produto p where p.titulo like CONCAT('%',:titulo,'%') and p.status = :status order by :order ")
    public List<Produto> findByTituloAndStatusOrderByOrder(String titulo, StatusProduto status, String order);
}
