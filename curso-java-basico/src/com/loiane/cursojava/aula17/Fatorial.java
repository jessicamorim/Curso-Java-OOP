package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		System.out.println(numero + " ! = ");
		
			int fatorial = 1;
			
			for(int i = numero; i > 0; i--) {
				fatorial *= i;
				System.out.println(i + " * ");
			}
			
			System.out.println("Resultado: " + fatorial);
	}
}
