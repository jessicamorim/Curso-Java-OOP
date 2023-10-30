package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Turno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Turno (m - v - n): ");
		String turno = scan.next();
		
			switch(turno) {
				case "m":
				case "M": System.out.println("Bom dia!"); break;
				case "v":
				case "V": System.out.println("Boa Tarde!"); break;
				case "n":
				case "N": System.out.println("Boa Noite!"); break;	
				default: System.out.println("Valor invalido");	
			}
	}
}
