package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com um numero para a posicao A = " + i);
			vetorA[i] = scan.nextInt();	
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			
			System.out.printf("Entre com um numero para a posicao B = " + i);
			vetorB[i] = scan.nextInt();	
			
			if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;				
			}else if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}else {
				vetorC[i] = -1;
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
	
		System.out.printf("Vetor C = ");
		for(int i = 0; i < (vetorC.length/2); i++) {
			System.out.printf(vetorC[i] + " ");	
		}
		System.out.println();

	}
}
