package br.com.hibejix.reformainteligente.services;

import br.com.hibejix.reformainteligente.entities.Produto;
import br.com.hibejix.reformainteligente.repositories.ProdutoRepository;
import br.com.hibejix.reformainteligente.services.exception.ProdutoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TintaService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Float calcularAreaPorIdProduto(final Float altura, final Float largura, final Long idProduto) {
        Optional<Produto> produto = produtoRepository.findById(idProduto);
        Float litrosTintaLata = (altura * largura) / produto.orElseThrow(() -> new ProdutoNotFoundException(
                "Produto não encontrado! Id: " + idProduto + ", Tipo: " + Produto.class.getName())
        ).getLitros();
        return litrosTintaLata;
    }


}
