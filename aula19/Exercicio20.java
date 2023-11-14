package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.printf("Entre com a cotacao do dolar: ");
		cotacao = scan.nextDouble();
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
			
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf(vetorA[i] + " ");	
		}
		System.out.println();
	}
}
