package br.com.aplicacoesdistribuidas.trabalhoemgrupo.singleton;

import br.com.aplicacoesdistribuidas.trabalhoemgrupo.model.Caminhao;

public class CaminhaoSingleton {
	private static Caminhao instance;
	public Caminhao getInstance() {
		if(instance == null) {
			instance = new Caminhao();
		}
		return instance;
	}
	
}
