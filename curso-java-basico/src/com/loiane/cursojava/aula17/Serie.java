package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Serie {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor: ");
		int valor = scan.nextInt();
		double soma = 0;
		
			for(int i=1, j=1 ; i<=valor; i++, j+=2) {
				
				System.out.print( i + "/" + j + " + ");
				
				soma += i / j;	
			}
			
			System.out.println(" \nSoma + " + soma);
	}
}
