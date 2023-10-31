package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Numero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Segundo Numero: ");
		int segundoNumero = scan.nextInt();
		
			if(primeiroNumero > segundoNumero) {
				System.out.println("O numero 1 e o maior: " + primeiroNumero);	
			}else {
				System.out.println("O numero 2 e o maior: " + segundoNumero);	
			}

	}

}
