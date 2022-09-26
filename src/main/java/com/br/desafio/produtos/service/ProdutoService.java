package com.br.desafio.produtos.service;

import com.br.desafio.produtos.enums.StatusProduto;
import com.br.desafio.produtos.model.Produto;

import java.util.List;

public interface ProdutoService {
    public List<Produto> findAllProdutos();

    public List<Produto> findAllProdutosByTituloAndStatusAndOrder(String titulo,
                                                                  StatusProduto status,
                                                                  String order);

    public Produto findProdutosById(Long id);
    public Produto save(Produto produto);
    public Produto update(Produto produto);
    public void delete(Produto produto);
}
