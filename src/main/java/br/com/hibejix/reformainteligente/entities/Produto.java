package br.com.hibejix.reformainteligente.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "PRODUTO")
@AllArgsConstructor
@NoArgsConstructor
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String descricao;

    private Integer litros;
}
