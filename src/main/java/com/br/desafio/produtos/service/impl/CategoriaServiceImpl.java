package com.br.desafio.produtos.service.impl;

import com.br.desafio.produtos.model.Categoria;
import com.br.desafio.produtos.repository.CategoriaRepository;
import com.br.desafio.produtos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }
}
