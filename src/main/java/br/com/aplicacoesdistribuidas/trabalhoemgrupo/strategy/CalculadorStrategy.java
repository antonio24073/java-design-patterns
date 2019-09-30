package br.com.aplicacoesdistribuidas.trabalhoemgrupo.strategy;

import br.com.aplicacoesdistribuidas.trabalhoemgrupo.model.Veiculo;

public class CalculadorStrategy {
	public static Double calculaGasolina(Veiculo veiculo, double km){
		return veiculo.calculaGasolina(km);
	}
}
