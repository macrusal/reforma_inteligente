package br.com.hibejix.reformainteligente.resources;

import br.com.hibejix.reformainteligente.entities.Area;
import br.com.hibejix.reformainteligente.services.AreaService;
import br.com.hibejix.reformainteligente.services.TintaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value="API REST - Calculadora")
@RestController
@RequestMapping(value="/hibejix-reforma/calculadora")
public class CalculadoraResources {

    @Autowired
    private TintaService tintaService;

    @Autowired
    private AreaService areaService;

    @ApiOperation(value="Retorna a Area baseada em um Id")
    @RequestMapping(value = {"/area/{idArea}"}, method=RequestMethod.GET)
    public ResponseEntity<Area> obterAreaPorId(@PathVariable final Long idArea) {

        Area area = areaService.findAreaById(idArea);
        return ResponseEntity.ok().body(area);
    }

    @ApiOperation(value="Retorna a quantidade de litros de tinta necessarios para pintar uma Area")
    @RequestMapping(value = {"/metros/{metros}/area/{idArea}"}, method=RequestMethod.GET)
    public ResponseEntity<?> calcularLitrosTintaAreaTotal(
                @PathVariable final Float metros,
                @PathVariable final Long idArea) {

        Area area = areaService.findAreaById(idArea);
        Float litrosTinta = area.getAreaTotal() * metros;
        return ResponseEntity.ok().body(litrosTinta);
    }

    @ApiOperation(value="Retorna a Area com as informações dos litros de tinta de acordo com o produto escolhido")
    @RequestMapping(value = {"/altura/{altura}/largura/{largura}/produto/{idProduto}"}, method=RequestMethod.GET)
    public ResponseEntity<?> calcularAreaPorProduto(
            @PathVariable final Float altura,
            @PathVariable final Float largura,
            @PathVariable final Long idProduto) {

        Float area = tintaService.calcularAreaPorIdProduto(altura, largura, idProduto);
        return ResponseEntity.ok().body(area);
    }
}
