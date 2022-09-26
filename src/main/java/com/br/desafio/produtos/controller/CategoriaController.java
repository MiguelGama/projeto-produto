package com.br.desafio.produtos.controller;

import com.br.desafio.produtos.dto.CategoriaDTO;
import com.br.desafio.produtos.dto.ProdutoDTO;
import com.br.desafio.produtos.model.Categoria;
import com.br.desafio.produtos.model.Produto;
import com.br.desafio.produtos.service.CategoriaService;
import com.br.desafio.produtos.service.ProdutoService;
import com.br.desafio.produtos.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
        @Autowired
        private CategoriaService categoriaService;

        @GetMapping
        public ResponseEntity<List<CategoriaDTO>> findAllCategoria(){
            List<CategoriaDTO> lista = ObjectMapperUtils
                    .mapAll(categoriaService.findAll(), CategoriaDTO.class);
            return ResponseEntity.ok(lista);
        }

        @GetMapping("/{id}")
        public ResponseEntity<CategoriaDTO> findProdutoById(@PathVariable Long id){
            CategoriaDTO categoria = ObjectMapperUtils
                    .map(categoriaService.findById(id), CategoriaDTO.class);
            return ResponseEntity.ok(categoria);
        }

        @PostMapping
        public ResponseEntity save(@RequestBody CategoriaDTO categoriaDTO){
            Categoria categoria = ObjectMapperUtils
                    .map(categoriaDTO, Categoria.class);
            categoriaService.save(categoria);
            return ResponseEntity.ok().build();
        }

        @PutMapping
        public ResponseEntity<Categoria> update(@RequestBody CategoriaDTO categoriaDTO){
            Categoria categoria = ObjectMapperUtils
                    .map(categoriaDTO, Categoria.class);
            return ResponseEntity.ok(categoriaService.save(categoria));
        }

        @DeleteMapping
        public ResponseEntity delete(@RequestBody CategoriaDTO categoriaDTO){
            Categoria categoria = ObjectMapperUtils
                    .map(categoriaDTO, Categoria.class);
            categoriaService.delete(categoria.getId());
            return ResponseEntity.ok().build();
        }
}
