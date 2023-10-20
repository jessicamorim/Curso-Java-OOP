package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			
			System.out.println("Nota entre 0 e 10: ");
			double nota = scan.nextDouble();
		
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voce digitou: " + nota);
			}else {
				notaValida = false;
				System.out.println("Nota inválida, digite novamente.");
			}

	}while(!notaValida);

}
}