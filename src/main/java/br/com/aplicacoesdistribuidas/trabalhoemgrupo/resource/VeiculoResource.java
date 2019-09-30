package br.com.aplicacoesdistribuidas.trabalhoemgrupo.resource;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aplicacoesdistribuidas.trabalhoemgrupo.model.Caminhao;
import br.com.aplicacoesdistribuidas.trabalhoemgrupo.model.Carro;
import br.com.aplicacoesdistribuidas.trabalhoemgrupo.singleton.CaminhaoSingleton;
import br.com.aplicacoesdistribuidas.trabalhoemgrupo.singleton.CarroSingleton;
import br.com.aplicacoesdistribuidas.trabalhoemgrupo.strategy.CalculadorStrategy;

@RestController
public class VeiculoResource {

    @PostMapping("/gasolina/carro/{km}")
    @Produces(MediaType.APPLICATION_XML)
    public String calculaGasolinaCarro(@PathVariable long km) {
        return "<gasolina>"+CalculadorStrategy.calculaGasolina(new CarroSingleton().getInstance(), km)+"</gasolina>";
    }
    @PostMapping("/gasolina/caminhao/{km}")
    @Produces(MediaType.APPLICATION_XML)
    public String calculaGasolinaCaminhao(@PathVariable long km) {
        return "<gasolina>"+CalculadorStrategy.calculaGasolina(new CaminhaoSingleton().getInstance(), km)+"</gasolina>";
    }
    @PostMapping("/gasolina/carro_caminhao/{km}")
    @Produces(MediaType.APPLICATION_XML)
    public String calculaGasolinaDecorator(@PathVariable long km) {
        return "<gasolina>"+CalculadorStrategy.calculaGasolina(new Caminhao(new Carro()), km)+"</gasolina>";
    }

}