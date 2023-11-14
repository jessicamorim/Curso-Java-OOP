package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao A - " + i);
			vetorA[i] = scan.nextInt();	
		}
		
		int posB = 0;
		int posC = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;	
			}else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < (vetorA.length/2); i++) {
			System.out.printf(vetorA[i] + " ");	
		}
		System.out.println();
		
		System.out.printf("Vetor B = ");
		for(int i = 0; i < posB; i++) {
			System.out.printf(vetorB[i] + " ");	
		}
		System.out.println();
		
		System.out.printf("Vetor C = ");
		for(int i = 0; i < posC; i++) {
			System.out.printf(vetorC[i] + " ");	
		}
		System.out.println();
		
	}

}
