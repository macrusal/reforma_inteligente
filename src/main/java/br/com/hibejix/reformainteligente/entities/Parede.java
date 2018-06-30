package br.com.hibejix.reformainteligente.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

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
    private Long idParede;

    private String descricao;

    private Float altura;

    private Float largura;

    private Float areaTotal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parede)) return false;
        Parede parede = (Parede) o;
        return Objects.equals(idParede, parede.idParede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParede);
    }

    @Override
    public String toString() {
        return "Parede{" +
                "idParede=" + idParede +
                ", altura=" + altura +
                ", largura=" + largura +
                ", areaTotal=" + areaTotal +
                '}';
    }
}
