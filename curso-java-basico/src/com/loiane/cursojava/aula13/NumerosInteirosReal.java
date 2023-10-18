package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class NumerosInteirosReal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro numero inteiro: ");
		int primeiroNumeroInteiro = scan.nextInt();
		System.out.println("Segundo numero inteiro:: ");
		int segundoNumeroInteiro = scan.nextInt();
		System.out.println("Numero real: ");
		double numeroReal = scan.nextDouble();
		
		double primeiroResultado = ((segundoNumeroInteiro / 2) * (2 * primeiroNumeroInteiro));
		double segundoResultado = ((primeiroNumeroInteiro * 3) + numeroReal);
		double terceiroResultado = numeroReal * numeroReal * numeroReal;
		
		System.out.println("Primeiro Resultado: " + primeiroResultado);
		System.out.println("Segundo Resultado: " + segundoResultado);
		System.out.println("Terceiro Resultado: " + terceiroResultado);
	}
}
