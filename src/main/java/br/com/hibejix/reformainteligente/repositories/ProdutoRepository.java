package br.com.hibejix.reformainteligente.repositories;

import br.com.hibejix.reformainteligente.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findById(final Long id);
}
