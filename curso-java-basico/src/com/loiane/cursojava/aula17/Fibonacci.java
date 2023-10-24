package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n-esimo termo da serie FIbonacci: ");
		int numero = scan.nextInt();
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		int proximo;
		
		System.out.println(primeiroNumero);
		System.out.println(segundoNumero);
		
			for(int i = 3; i <= numero; i++) {
				
				proximo = primeiroNumero + segundoNumero;
				primeiroNumero = segundoNumero;
				segundoNumero = proximo;	
				
				System.out.println(proximo);
			}
	}

}
