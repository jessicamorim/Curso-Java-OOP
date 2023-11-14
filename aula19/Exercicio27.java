package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com um numero para a posicao = " + i);
			vetorA[i] = scan.nextInt();	
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}else if(vetorA[i] > 10) {
				vetorB[i] = 'e';
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
