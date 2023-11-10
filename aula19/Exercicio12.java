package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		for(int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.printf("Soma: " + soma);
		
	}
}


