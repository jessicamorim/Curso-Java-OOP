package com.loiane.cursojava.aula17;

public class Panificadora {

	public static void main(String[] args) {
		
		System.out.println("Preco do pao: R$0.18");
		System.out.println("Panificadora Pao de Ontem - Tabela de Preços");
		
		for(int i=1; i <= 50; i++) {
			
			System.out.println( i + " - R$ " + (0.18 * i));
		}
	}

}
