package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class VogalConsoante {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Letra: ");
		String letra = scan.next();
		
		/*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
				|| letra.equalsIgnoreCase("u")) {
				
				System.out.println("Vogal");
		}else{
				System.out.println("Consoante");
		}*/
		
		if(letra.length() > 1) {
			System.out.println("Não e uma letra valida");
		}else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": 
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("Vogal"); break;
			default: System.out.println("Consoante");	
			}
		}	
	}
}