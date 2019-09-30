package br.com.aplicacoesdistribuidas.trabalhoemgrupo.model;

public class Carro extends Veiculo
{
	public Carro() {
		super();
	}
	public Carro(Veiculo outroVeiculo) {
		super(outroVeiculo);
	}

	@Override
	public Double calculaGasolina(double km) {
		double litros = 0.1 * km + calculaGasolinaDoOutroVeiculo(km);
		return litros;
	}

}
