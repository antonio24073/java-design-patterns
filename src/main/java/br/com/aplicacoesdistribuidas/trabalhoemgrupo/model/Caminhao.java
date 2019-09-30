package br.com.aplicacoesdistribuidas.trabalhoemgrupo.model;

public class Caminhao extends Veiculo
{
	public Caminhao() {
		super();
	}
	public Caminhao(Veiculo outroVeiculo) {
		super(outroVeiculo);
	}

	@Override
	public Double calculaGasolina(double km) {
		double litros = 0.15 * km + calculaGasolinaDoOutroVeiculo(km);
		return litros;
	}
}
