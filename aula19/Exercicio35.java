package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao A - " + i);
			vetorA[i] = scan.nextInt();		
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Analizando o numero - " + vetorA[i]);
		
			for(int j = 1; j < vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					System.out.printf(j + " e divisor");
				}
			}
			
			System.out.println();
		}
	
	}
}
