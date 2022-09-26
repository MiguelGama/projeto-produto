package com.br.desafio.produtos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Tag implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
}
