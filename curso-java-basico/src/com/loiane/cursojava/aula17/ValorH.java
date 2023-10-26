package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class ValorH {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor: ");
		int valor = scan.nextInt();
		
		double soma = 0;
		
			for(int i=1; i<=valor; i++) {
				
				soma += 1 /i;
			}
			
			System.out.println("Soma + " + soma);

	}
}
