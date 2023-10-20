package com.loiane.cursojava.aula17;

public class Populacao {

	public static void main(String[] args) {
		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;
		
			while(populacaoA < populacaoB) {
				populacaoA +=(populacaoA/100) * 3;
				populacaoB +=(populacaoB/100) * 1.5;
				cont++;		
			}
			
			System.out.println("Populacao A: " + populacaoA);
			System.out.println("Populacao B: " + populacaoB);
			System.out.println("Qauntidade de anos: " + cont);
		}
}
