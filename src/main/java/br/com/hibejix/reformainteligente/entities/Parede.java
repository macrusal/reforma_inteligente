package br.com.hibejix.reformainteligente.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAREDE")
public class Parede implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_PAREDE")
    private Long idParede;

    private String descricao;

    private Float altura;

    private Float largura;

    private Float areaTotal;

    @JsonIgnore
    @ManyToOne
    private Area area;
}
