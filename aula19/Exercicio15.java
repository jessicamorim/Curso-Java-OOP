package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int impar = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
			
				impar++;
			}
		}
		
		int par = vetorA.length - impar;
		
		double porcPar = (par * 100) / vetorA.length;
		double porcImpar = 100 - porcPar;
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Porcentagem Pares: " + porcPar);
		System.out.println("Porcentagem Impares: " + porcImpar);
			
	}
}
