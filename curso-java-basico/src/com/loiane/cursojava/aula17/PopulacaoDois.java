package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class PopulacaoDois {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double populacaoA;
		double populacaoB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;
		
			do {
			
				System.out.println("Populacao A: ");
				populacaoA = scan.nextDouble();
				
				if(populacaoA > 0) {
					valido = true;
				}else {
					System.out.println("Populacao a precisa ser maior que 0. ");
				}		
			}while(!valido);
	
	valido = false;
	
		do {
	
			System.out.println("Populacao B: ");
			populacaoB = scan.nextDouble();
			
			if(populacaoB > 0) {
				valido = true;
			}else {
				System.out.println("Populacao b precisa ser maior que 0. ");
			}		
		
		}while(!valido);
		
		valido = false;
		
		do {
	
			System.out.println("Tava populacao A: ");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento da populacao a precisa ser maior que 0. ");
			}		
		
		}while(!valido);
		
		valido = false;
		
		do {
	
			System.out.println("Tava populacao B: ");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento da populacao b precisa ser maior que 0. ");
			}		
		
		}while(!valido);
		
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
