package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class SomaNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Numero: ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Segundo Numero: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("A soma dos numeros e: " + (primeiroNumero + segundoNumero));
	}
}
