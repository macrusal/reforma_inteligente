package br.com.hibejix.reformainteligente.services;

import br.com.hibejix.reformainteligente.entities.Area;
import br.com.hibejix.reformainteligente.entities.Parede;
import br.com.hibejix.reformainteligente.repositories.AreaRepository;
import br.com.hibejix.reformainteligente.services.exception.AreaNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    public Area findAreaById(final Long id) {
        Optional<Area> area = areaRepository.findById(id);
        Float areaTotal = Float.valueOf(0);
        for (Parede parede : area.get().getParedes()) {
            areaTotal =  areaTotal + parede.getAltura() * parede.getLargura();
        }
        area.get().setAreaTotal(areaTotal);

        return area.orElseThrow(() -> new AreaNotFoundException(
                "Area não encontrada! Id: " + id + ", Tipo: " + Area.class.getName()));
    }
}
