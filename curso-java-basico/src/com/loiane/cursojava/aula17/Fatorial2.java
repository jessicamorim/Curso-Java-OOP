package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Fatorial2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		System.out.println("Fatorial de " + numero);
		
		System.out.print(numero + "! = ");
		
			int fatorial = 1;
			
			for(int i = numero; i > 1; i--) {
				fatorial *= i;
				System.out.print(i + " . ");
			}
			
			System.out.println(" 1 = " + fatorial);
	}
}
