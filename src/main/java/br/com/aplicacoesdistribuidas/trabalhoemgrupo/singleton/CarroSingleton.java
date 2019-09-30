package br.com.aplicacoesdistribuidas.trabalhoemgrupo.singleton;

import br.com.aplicacoesdistribuidas.trabalhoemgrupo.model.Carro;

public class CarroSingleton {
	private static Carro instance;
	public Carro getInstance() {
		if(instance == null) {
			instance = new Carro();
		}
		return instance;
	}
	
}
