package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		boolean invalido = true;
		int numeroInicio;
		int numeroFinal;
		
		do {
			
			System.out.println("Numero para o inicio da tabuada: ");
			numeroInicio = scan.nextInt();
			
			System.out.println("Numero para o final da tabuada: ");
			numeroFinal = scan.nextInt();
			
				if(numeroFinal > numeroInicio) {
					invalido = false;
					
				}
			
		}while(invalido);
	
			System.out.println("Tabuada de " + numero + ":");
			System.out.println("Começar por: " + numeroInicio + ":");
			System.out.println("Terminar em: " + numeroFinal + ":");
			System.out.println();
		
				for(int i = numeroInicio; i <= numeroFinal; i++) {
				
					System.out.println(numero + " x " + i + " = " + (numero * i));
				}
	}

}
