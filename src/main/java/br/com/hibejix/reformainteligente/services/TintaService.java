package br.com.hibejix.reformainteligente.services;

import br.com.hibejix.reformainteligente.entities.Area;
import br.com.hibejix.reformainteligente.entities.Produto;
import br.com.hibejix.reformainteligente.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TintaService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Area calcularLitrosTintaAreaTotal(final Float metros) {

        Optional<Produto> produto = produtoRepository.findById(1l);
        Area area = Area.builder()
                .nome("Sala Principal")
                .areaTotal(produto.get().getLitros() * metros)
                .build();
        return area;
    }

    public Float calcularLitrosTintaAlturaLargura(final Float altura, final Float largura) {
        Float litrosTintaLata = Float.valueOf(10);
        return (altura * largura) / litrosTintaLata;
    }


}
