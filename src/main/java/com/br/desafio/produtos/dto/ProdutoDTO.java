package com.br.desafio.produtos.dto;

import com.br.desafio.produtos.enums.StatusProduto;
import com.br.desafio.produtos.model.Categoria;
import com.br.desafio.produtos.model.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO implements Serializable {
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "Campo titulo necessário")
    private String titulo;
    @NotEmpty
    @Size(min = 2, message = "Campo descricao necessário")
    private String descricao;
    @NotEmpty
    private StatusProduto status;
    private List<CategoriaDTO> categorias;
    private List<Tag> tag;
    @NotEmpty
    private Double preco;
    private LocalDate dtCriacao;
}
