package com.br.desafio.produtos.service;

import com.br.desafio.produtos.model.Categoria;
import com.br.desafio.produtos.model.Tag;

import java.util.List;

public interface TagService {
    Tag save(Tag tag);
    List<Tag> findAll();
    Tag findById(Long id);
    void delete(Long id);
}
