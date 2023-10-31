package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Crime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vitima?");
		String resposta1 = scan.next();
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		System.out.println("Mora perto da vitima?");
		String resposta3 = scan.next();
		System.out.println("Ja trabalhou com a vitima?");
		String resposta4 = scan.next();
		System.out.println("Devia para a vitima?");
		String resposta5 = scan.next();
		
			int cont = 0;
		
			if(resposta1.equalsIgnoreCase("S")) {
				cont++;
			}
			
			if(resposta2.equalsIgnoreCase("S")) {
				cont++;
			}
			
			if(resposta2.equalsIgnoreCase("S")) {
				cont++;
			}
			
			if(resposta4.equalsIgnoreCase("S")) {
				cont++;
			}
			
			if(resposta5.equalsIgnoreCase("S")) {
				cont++;
			}
			
				if(cont == 2) {
					System.out.println("Suspeita");	
				}else if(cont == 3 || cont == 4) {
					System.out.println("Cumplice");			
				}else if(cont == 5) {
					System.out.println("Assassino");	
				}else if(cont == 0) {
					System.out.println("Inocente");	
				}
	}

}
