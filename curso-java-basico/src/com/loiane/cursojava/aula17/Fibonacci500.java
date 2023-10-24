package com.loiane.cursojava.aula17;

public class Fibonacci500 {

	public static void main(String[] args) {
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		int proximo = 0;
		
		System.out.println(primeiroNumero);
		System.out.println(segundoNumero);
		
			while(proximo < 500) {
			
				proximo = primeiroNumero + segundoNumero;
				primeiroNumero = segundoNumero;
				segundoNumero = proximo;	
			
				System.out.println(proximo);
			}
	}

}
