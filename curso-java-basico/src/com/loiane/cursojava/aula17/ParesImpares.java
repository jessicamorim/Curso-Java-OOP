package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int pares = 0;
		int impares = 0;
		
			for(int i = 0; i < 10; i++) {
				System.out.println("Numero: ");
				numero = scan.nextInt();
				
					if(numero % 2 == 0) {
						pares++;
					}else {
						impares++;
					}
			}	
			
			System.out.println("Pares: " + pares);
			System.out.println("Impares: " + impares);
	}
}
