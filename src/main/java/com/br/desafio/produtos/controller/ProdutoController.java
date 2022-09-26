package com.br.desafio.produtos.controller;

import com.br.desafio.produtos.dto.ProdutoDTO;
import com.br.desafio.produtos.enums.StatusProduto;
import com.br.desafio.produtos.model.Produto;
import com.br.desafio.produtos.service.ProdutoService;
import com.br.desafio.produtos.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {
        @Autowired
        private ProdutoService produtoService;

        @GetMapping
        public ResponseEntity<List<ProdutoDTO>> findAllProdutos(){
            List<ProdutoDTO> lista = ObjectMapperUtils
                    .mapAll(produtoService.findAllProdutos(), ProdutoDTO.class);
            return ResponseEntity.ok(lista);
        }

        @GetMapping("/{id}")
        public ResponseEntity<ProdutoDTO> findProdutoById(@PathVariable Long id){
            ProdutoDTO produto = ObjectMapperUtils
                    .map(produtoService.findProdutosById(id), ProdutoDTO.class);
            return ResponseEntity.ok(produto);
        }

        @GetMapping("/filtros/{titulo}/{status}/{order}")
        public ResponseEntity<List<ProdutoDTO>> findProdutoByStatus(
                @PathVariable String titulo,
                @PathVariable StatusProduto status,
                @PathVariable String order
        ){
            List<ProdutoDTO> produtos = ObjectMapperUtils
                    .mapAll(produtoService.findAllProdutosByTituloAndStatusAndOrder(titulo,
                            status, order), ProdutoDTO.class);
            return ResponseEntity.ok(produtos);
    }

        @PostMapping
        public ResponseEntity save(@RequestBody ProdutoDTO produtoDto){
            Produto produto = ObjectMapperUtils
                    .map(produtoDto, Produto.class);
            produtoService.save(produto);
            return ResponseEntity.ok().build();
        }

        @PutMapping
        public ResponseEntity<Produto> update(@RequestBody ProdutoDTO produtoDto){
            Produto produto = ObjectMapperUtils
                    .map(produtoDto, Produto.class);
            return ResponseEntity.ok(produtoService.update(produto));
        }

        @DeleteMapping
        public ResponseEntity delete(@RequestBody Produto produtoDto){
            Produto produto = ObjectMapperUtils
                    .map(produtoDto, Produto.class);
            produtoService.delete(produto);
            return ResponseEntity.ok().build();
        }
}
