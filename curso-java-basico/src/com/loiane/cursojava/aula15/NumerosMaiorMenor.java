package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class NumerosMaiorMenor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Numero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Segundo Numero: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Terceiro Numero: ");
		int terceiroNumero = scan.nextInt();
		
			if(primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
				System.out.println("O numero um e o maior");
			}else if(segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
				System.out.println("O numero dois e o maior");
			}else if(terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero) {
				System.out.println("O numero tres e o maior");
			}	
			
			if(primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero) {
				System.out.println("O numero um e o menor");
			}else if(segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero) {
				System.out.println("O numero dois e o menor");
			}else if(terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero) {
				System.out.println("O numero tres e o menor");
			}	

	}

}
