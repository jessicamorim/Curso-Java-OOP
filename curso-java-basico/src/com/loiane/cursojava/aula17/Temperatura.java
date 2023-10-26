package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade Temperatura: ");
		int quantidadeTemperatura = scan.nextInt();
		
		double temperatura;
		double soma = 0;
		
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_NORMAL;
		
			for(int i = 1; i <= quantidadeTemperatura; i++) {
				
				System.out.println("Temperatura: " + i);
				temperatura = scan.nextDouble();
				
				soma += temperatura;
				
					if(temperatura > maior) {
						maior = temperatura;		
					}
					if(temperatura < menor) {
						menor = temperatura;
					}
			}
			
			System.out.println("Media: " + (soma / quantidadeTemperatura));
			System.out.println("Menor temperatura: " + menor);
			System.out.println("Maior temperatura: " + maior);

	}
}
