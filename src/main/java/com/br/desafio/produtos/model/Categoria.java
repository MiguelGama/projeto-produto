package com.br.desafio.produtos.model;

import com.br.desafio.produtos.enums.StatusProduto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Categoria implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_categoria")
    private Long id;
    private String nome;
}
