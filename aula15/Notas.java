package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeira Nota: ");
		double primeiraNota = scan.nextDouble();
		System.out.println("Segunda Nota: ");
		double segundaNota = scan.nextDouble();
		
			double media = (primeiraNota + segundaNota) / 2;
			
			if(media == 10) {
				System.out.println("Aprovado com distinçao");
			}else if(media >= 7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}

	}

}
