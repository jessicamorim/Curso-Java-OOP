package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		System.out.println("Tabuada de " + numero + ":");
		
			for(int i = 1; i <=10; i++) {
				
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
	}
}
