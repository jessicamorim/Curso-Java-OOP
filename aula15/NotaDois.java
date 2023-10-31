package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class NotaDois {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeira Nota: ");
		double primeiraNota = scan.nextDouble();
		System.out.println("Segunda Nota: ");
		double segundaNota = scan.nextDouble();
		
			double media = (primeiraNota + segundaNota) / 2;
			
			String aproveitamento = "";
				if(media >= 9 && media <= 10) {
					aproveitamento = "A";	
				}else if(media >= 7.5 && media < 9) {
					aproveitamento = "B";	
				}else if(media >= 6 && media < 7.5) {
					aproveitamento = "C";	
				}else if(media >= 0 && media < 4) {
					aproveitamento = "E";	
				}
				
				System.out.println("Primeira Nota: " + primeiraNota);
				System.out.println("Segunda Nota: " + segundaNota);
				System.out.println("Media: " + media);	
				System.out.println("Conceito: " + aproveitamento);
				
				switch(aproveitamento) {
					case "A":
					case "B":
					case "C": System.out.println("APROVADO"); break;
					case "D":
					case "E": System.out.println("REPROVADO"); break;
			
				
				}
				
			

	}

}
