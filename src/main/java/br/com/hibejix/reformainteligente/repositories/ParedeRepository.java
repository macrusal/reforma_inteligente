package br.com.hibejix.reformainteligente.repositories;

import br.com.hibejix.reformainteligente.entities.Parede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ParedeRepository extends JpaRepository<Parede, Long> {
    @Query(value = "SELECT * FROM area A, parede P WHERE A.id = P.area_id AND A.id = :idArea", nativeQuery = true)
    List<Parede> findParedesByIdArea(@Param("idArea") Long idArea);
}
