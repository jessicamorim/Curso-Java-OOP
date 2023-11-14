package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com um numero para a posicao " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;		
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < (vetorA.length/2); i++) {
			System.out.printf(vetorA[i] + " ");	
		}
		System.out.println();
		System.out.printf("Vetor B = ");
		for(int i = 0; i < (vetorB.length/2); i++) {
			System.out.printf(vetorB[i] + " ");	
		}
		System.out.println();

	}

}
