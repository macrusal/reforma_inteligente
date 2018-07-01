package br.com.hibejix.reformainteligente.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "AREA")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Float areaTotal;

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Parede> paredes;

}
