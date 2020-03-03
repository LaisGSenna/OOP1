package br.lasalle.oop.trab1;

public class Carro {
	String modelo;
	String cor;
	int ano;
	boolean aberto;
	
	void funcionar() {
		if(!aberto) 
			System.out.println("Em funcionamento!");
		else
		    System.out.println("Portas abertas! Não está operando!");
		
	}
	
	void abrir() {
		aberto = true;
	}
	
	void fechar() {
		aberto = false;
	}

}
