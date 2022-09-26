package com.br.desafio.produtos.service.impl;

import com.br.desafio.produtos.enums.StatusProduto;
import com.br.desafio.produtos.model.Produto;
import com.br.desafio.produtos.repository.ProdutoRepository;
import com.br.desafio.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAllProdutos() {
        return (List<Produto>) produtoRepository.findAll();
    }

    @Override
    public List<Produto> findAllProdutosByTituloAndStatusAndOrder(String titulo,
                                                                  StatusProduto status,
                                                                  String order) {
        return produtoRepository.findByTituloAndStatusOrderByOrder(titulo,status,order);
    }

    @Override
    public Produto findProdutosById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Produto update(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void delete(Produto produto) {
        produtoRepository.delete(produto);

    }
}
