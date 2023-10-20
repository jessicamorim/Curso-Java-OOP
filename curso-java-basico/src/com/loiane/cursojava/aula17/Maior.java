package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = Integer.MIN_VALUE;
		
			for(int i = 0; i < 5; i++) {
				
				System.out.println("Numero: ");
				numero = scan.nextInt();
				
				if(numero > maior) {
					maior = numero;
					System.out.println("O numero maior mudou: " + maior);
				}
			}
			
			System.out.println("O maior numero digitado e: " + maior);
	}
}
