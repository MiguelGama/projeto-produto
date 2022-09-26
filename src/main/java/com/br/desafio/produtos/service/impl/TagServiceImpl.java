package com.br.desafio.produtos.service.impl;

import com.br.desafio.produtos.model.Categoria;
import com.br.desafio.produtos.model.Tag;
import com.br.desafio.produtos.repository.CategoriaRepository;
import com.br.desafio.produtos.repository.TagRepository;
import com.br.desafio.produtos.service.CategoriaService;
import com.br.desafio.produtos.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public List<Tag> findAll() {
        return (List<Tag>) tagRepository.findAll();
    }

    @Override
    public Tag findById(Long id) {
        return tagRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        tagRepository.deleteById(id);
    }
}
