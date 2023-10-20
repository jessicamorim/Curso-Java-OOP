package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class NumerosUm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Numero: ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Segundo Numero: ");
		int segundoNumero = scan.nextInt();
		
			for(int i = primeiroNumero; i <= segundoNumero; i++ ) {
				System.out.println(i);
			}	
	}
}
