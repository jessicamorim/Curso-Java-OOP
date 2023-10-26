package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class CDs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero de Cds: ");
		int cds = scan.nextInt();
		
		double preco;
		double soma = 0;
		
			for(int i=0; i < cds; i++) {
				
				System.out.println("Valor dos cds: " + i);
				preco = scan.nextDouble();
				
				soma += preco;
			}
			
			double media = soma / cds;
			
			System.out.println("Media gasta com cada CD: " + media);
		
	}
}
