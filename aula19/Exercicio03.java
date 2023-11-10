package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
		
			System.out.println("Entre com o valor da posicao: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.println("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.printf(vetorB[i] + " ");
		}
		System.out.println();

	}
}
