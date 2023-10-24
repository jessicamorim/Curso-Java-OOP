package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero Notas: ");
		int notas = scan.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
			for(int i=0; i < notas; i++) {
				
				System.out.println("Nota: " + (i + 1) );
				nota = scan.nextDouble();
				
				soma += nota;
			}
			
			media = soma / notas;
			
			System.out.println("Soma: " + soma);
			System.out.println("Media: " + media);
	}
}
