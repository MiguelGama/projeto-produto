package com.br.desafio.produtos.model;

import com.br.desafio.produtos.enums.StatusProduto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private StatusProduto status;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Categoria> categorias;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Tag> tag;
    private Double preco;
    @CreatedDate
    private LocalDate dtCriacao;

}
