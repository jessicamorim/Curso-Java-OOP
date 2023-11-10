package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com o valor do vetorA da posicao: " + i);
			vetorA[i] = scan.nextInt();	
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			
			System.out.println("Entre com o valor do vetorB da posicao: " + i);
			vetorB[i] = scan.nextInt();	
		}
		
		for(int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.printf("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.printf("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();

	}

}
