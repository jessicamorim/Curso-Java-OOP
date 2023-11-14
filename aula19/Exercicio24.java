package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com um numero para a posicao " + i);
			vetorA[i] = scan.nextInt();
				
		}
		
		boolean palindromo = true;
		for(int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
				
			}		
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < (vetorA.length/2); i++) {
			System.out.printf(vetorA[i] + " ");	
		}
		System.out.println();
		
		if(palindromo) {
			System.out.printf("Palindromo ");	
		}else {
			System.out.printf("Nao e Palindromo ");
		}
	}
}


