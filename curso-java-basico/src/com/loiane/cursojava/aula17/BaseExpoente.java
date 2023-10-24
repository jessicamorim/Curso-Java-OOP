package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class BaseExpoente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Base: ");
		int base = scan.nextInt();
		
		System.out.println("Expoente: ");
		int expoente = scan.nextInt();
		
			int resultado = base;
			
			for(int i=1; i < expoente; i++) {
				resultado *= base;
			}
			
			System.out.println("Resultado: " + resultado);
	}
}
