package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for(int i = 0; i < idades.length; i++) {
			
			System.out.printf("Entre com a idade da pessoa: " + (i + 1));
			idades[i] = scan.nextInt();
		}
		
		int menor = idades[0];
		int indexMenor = 0;
		int maior = idades[0];
		int indexMaior = 0;
		
		for(int i = 1; i < idades.length; i++) {
			if(idades[0] > maior) {
				maior = idades[0];
				indexMaior = i;
			}else if(idades[0] < menor){
				menor = idades[0];
				indexMenor = i;
			}	
		}
		
		System.out.printf("Vetor de idades = ");
		for(int i = 0; i < idades.length; i++) {
			System.out.printf(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Menor idade: " + menor);
		System.out.println("Indice menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maior);
		System.out.println("Indice maior idade: " +indexMaior);
		
	}
}
