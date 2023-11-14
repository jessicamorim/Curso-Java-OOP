package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao A - " + i);
			vetorA[i] = scan.nextInt();		
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			
			vetorB[i] = 1;
			for(int j = 1; j <= vetorA[i]; j++) {
				vetorB[i] = j;
			}
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
