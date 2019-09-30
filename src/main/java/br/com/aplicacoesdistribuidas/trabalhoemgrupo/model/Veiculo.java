package br.com.aplicacoesdistribuidas.trabalhoemgrupo.model;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

abstract public class Veiculo {

	private Veiculo outroVeiculo;

	public Veiculo() {
	}

	public Veiculo(Veiculo outroVeiculo) {
		this.outroVeiculo = outroVeiculo;
	}

	public String toXML() {
		return new XStream().toXML(this);
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

	public abstract Double calculaGasolina(double km);

	public Double calculaGasolinaDoOutroVeiculo(double km) {
		if (outroVeiculo == null) {
			return 0.0;
		}
		return outroVeiculo.calculaGasolina(km);
	}
}
