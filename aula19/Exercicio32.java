package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao A - " + i);
			vetorA[i] = scan.nextInt();	
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Tabuada de " + vetorA[i]);
			
			for(int j =1; j<=10; j++) {
				
				System.out.printf(j + " * " + vetorA[i] + " = " + (vetorA[i]*j));	
			}
			System.out.println();
			
		}


	}
}
