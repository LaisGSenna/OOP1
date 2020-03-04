package br.lasalle.oop.trab1;

public class PortaTester {

	Carro carroPreto = new Carro();
		
		carroPreto.modelo = "corolla";
		carroPreto.cor = "preto";
		carroPreto.ano = 2020;
			
		carroPreto.fechar();
		
		carroPreto.funcionar();
		
		
		Elevador elevadorBass = new Elevador();
		
		elevadorBass.modelo = "panoramico";
		elevadorBass.marca = "bass";
		elevadorBass.ano = 2020;
		elevadorBass.capacidade = 350;
		
		
		elevadorBass.fechar();
		elevadorBass.funcionar();

	}

}
