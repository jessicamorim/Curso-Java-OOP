package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Turmas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Turmas: ");
		int turmas = scan.nextInt();
		
		int numeroAlunos;
		int soma = 0;
		boolean invalido = true;
		
		for(int i=0; i < turmas; i++) {
			
			invalido = true;
			do {
				System.out.println("Numero de alunos: " + i);
				numeroAlunos = scan.nextInt();
				
				if(numeroAlunos <= 40) {
					invalido = false;
				}else {
					System.out.println("Numero de alunos invalido. Digite novamente: ");
				}
			}while(invalido);
			
			soma += numeroAlunos;
		}
		
		double media = soma / turmas;
		
		System.out.println("Media: " + media);
	}
}
