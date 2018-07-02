package br.com.hibejix.reformainteligente.repositories;

import br.com.hibejix.reformainteligente.entities.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
}
