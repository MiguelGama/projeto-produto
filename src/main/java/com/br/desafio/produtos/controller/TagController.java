package com.br.desafio.produtos.controller;

import com.br.desafio.produtos.dto.TagDTO;
import com.br.desafio.produtos.model.Tag;
import com.br.desafio.produtos.service.TagService;
import com.br.desafio.produtos.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tag")
public class TagController {
        @Autowired
        private TagService tagService;

        @GetMapping
        public ResponseEntity<List<TagDTO>> findAll(){
            List<TagDTO> lista = ObjectMapperUtils
                    .mapAll(tagService.findAll(), TagDTO.class);
            return ResponseEntity.ok(lista);
        }

        @GetMapping("/{id}")
        public ResponseEntity<TagDTO> findById(@PathVariable Long id){
            TagDTO tags = ObjectMapperUtils
                    .map(tagService.findById(id), TagDTO.class);
            return ResponseEntity.ok(tags);
        }

        @PostMapping
        public ResponseEntity save(@RequestBody TagDTO tagDTO){
            Tag tag = ObjectMapperUtils
                    .map(tagDTO, Tag.class);
            tagService.save(tag);
            return ResponseEntity.ok().build();
        }

        @PutMapping
        public ResponseEntity<Tag> update(@RequestBody TagDTO tagDTO){
            Tag tag = ObjectMapperUtils
                    .map(tagDTO, Tag.class);
            return ResponseEntity.ok(tagService.save(tag));
        }

        @DeleteMapping
        public ResponseEntity delete(@RequestBody TagDTO tagDTO){
            Tag tag = ObjectMapperUtils
                    .map(tagDTO, Tag.class);
            tagService.delete(tag.getId());
            return ResponseEntity.ok().build();
        }
}
