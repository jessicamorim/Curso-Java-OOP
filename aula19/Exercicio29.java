package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao A - " + i);
			vetorA[i] = scan.nextInt();	
			
			vetorC[i] = vetorA[i];
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			
			System.out.printf("Entre com o valor da posicao B " + i);
			vetorA[i] = scan.nextInt();	
			
			vetorC[vetorA.length + i] = vetorB[i];
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
		
		System.out.printf("Vetor C = ");
		for(int i = 0; i < (vetorC.length/2); i++) {
			System.out.printf(vetorC[i] + " ");	
		}
		System.out.println();
		
	}
}
