package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class SomaMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;	
		int soma = 0;
		double media;
		
		
		for(int i = 1; i < 5; i++) {
			
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma += numero;
		}
		
		media = soma / 5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	}
}
