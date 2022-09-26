package com.br.desafio.produtos.service;

import com.br.desafio.produtos.model.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria save(Categoria categoria);
    List<Categoria> findAll();
    Categoria findById(Long id);
    void delete(Long id);
}
