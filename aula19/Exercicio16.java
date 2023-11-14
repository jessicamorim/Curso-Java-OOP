package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.printf("Entre com o valor da posicao: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		int igual15 = 0;
		
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] == 15) {
				igual15++;
			}else if(vetorA[i] < 15) {
				somaMenor15 += vetorA[i];	
			}else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}
		}
		
		System.out.printf("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros igual a 15: " + igual15);
		System.out.println("Soma de numeros menores que 15: " + somaMenor15);
		System.out.println("Media de numeros maior que 15: " + (somaMaior15/qtdMaior15));

	}
}
