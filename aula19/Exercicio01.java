package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
		
			System.out.printf("Entre com o valor da posicao: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.printf("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.printf(vetorB[i] + " ");
		}
		System.out.println();
	}
}
