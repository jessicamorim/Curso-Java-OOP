package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class NumeroDois {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Numero: ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Segundo Numero: ");
		int segundoNumero = scan.nextInt();
		
			int soma = 0;
		
			for(int i = primeiroNumero; i <= segundoNumero; i++ ) {
				soma += i;
			}
			
			System.out.println("Soma: " + soma);
	}
}
