package br.com.hibejix.reformainteligente.resources;

import br.com.hibejix.reformainteligente.entities.Area;
import br.com.hibejix.reformainteligente.services.TintaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hibejix-reforma/calculadora")
public class CalculadoraResources {

    @Autowired
    private TintaService tintaService;

    @RequestMapping(value = {"/metros/{metros}"}, method=RequestMethod.GET)
    public ResponseEntity<Area> calcularLitrosTintaAreaTotal(@PathVariable final Float metros) {

        Area area = tintaService.calcularLitrosTintaAreaTotal(metros);
        return ResponseEntity.ok().body(area);
    }

    @RequestMapping(value = {"/altura/largura/{altura}/{largura}"}, method=RequestMethod.GET)
    public ResponseEntity<?> calcularLitrosTintaAlturaLargura(
            @PathVariable final Float altura,
            @PathVariable final Float largura) {

        Float quantidadeLitros = tintaService.calcularLitrosTintaAlturaLargura(altura, largura);
        return ResponseEntity.ok().body(quantidadeLitros);
    }
}
