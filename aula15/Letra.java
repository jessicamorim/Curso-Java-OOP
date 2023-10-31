package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Letra {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Letra (F ou M): ");
		String letra = scan.next();
		
			if(letra.equalsIgnoreCase("f")) {
				System.out.println("F - feminino");
			}else if(letra.equalsIgnoreCase("m")) {
				System.out.println("M - masculino");
			}else {
				System.out.println("Sexo invalido");
			}
	}
}
