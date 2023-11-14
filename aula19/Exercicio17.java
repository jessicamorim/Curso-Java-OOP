package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for(int i = 0; i < idades.length; i++) {
			
			System.out.printf("Entre com a idade da pessoa: " + (i + 1));
			idades[i] = scan.nextInt();
		}
		
		int qtd = 0;
		for(int i = 0; i < idades.length; i++) {
			if(idades[i] > 35) {
				qtd++;
			}
		}
		
		System.out.printf("Vetor de idades = ");
		for(int i = 0; i < idades.length; i++) {
			System.out.printf(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de pessoas com idade maior que 15: " + qtd);
		
	}
}
