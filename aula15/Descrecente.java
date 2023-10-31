package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Descrecente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Numero: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Segundo Numero: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Terceiro Numero: ");
		int terceiroNumero = scan.nextInt();
		
		if(primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero 
				&& segundoNumero <= terceiroNumero) {
			System.out.println(terceiroNumero + " - " + segundoNumero + " - " + primeiroNumero);
		}else if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero 
				&& terceiroNumero <= segundoNumero) {
			System.out.println(segundoNumero  + " - " + terceiroNumero + " - " + primeiroNumero);
		}else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero 
				&& primeiroNumero <= segundoNumero) {
			System.out.println(terceiroNumero  + " - " + primeiroNumero + " - " + segundoNumero);
		}else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero 
				&& terceiroNumero <= primeiroNumero) {
			System.out.println(primeiroNumero  + " - " + terceiroNumero + " - " + segundoNumero);
		}else if (terceiroNumero >= primeiroNumero && segundoNumero >= primeiroNumero 
				&& primeiroNumero <= segundoNumero) {
			System.out.println(segundoNumero  + " - " + primeiroNumero + " - " + terceiroNumero);
		}else if (terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero 
				&& segundoNumero <= primeiroNumero) {
			System.out.println(primeiroNumero  + " - " + segundoNumero + " - " + terceiroNumero);
		}
	}
}
