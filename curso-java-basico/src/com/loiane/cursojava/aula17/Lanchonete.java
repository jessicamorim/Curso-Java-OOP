package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int codigo;
		int quantidade;
		double total = 0;
		String output = "";
		
		do {
			
			System.out.println("Codigo e Quantidade. Digite 0 0 para sair. ");
			codigo = scan.nextInt();
			quantidade = scan.nextInt();
			
				if(codigo == 0 && quantidade == 0) {
					naoTerminar = false;
					output += "Total a pagar = " + total;
				}else {
					if(codigo == 100) {
						output += "Cachorro Quente -> 1.20 * " + quantidade;
						output += " = " + (1.2 * quantidade) + "\n";
						total += 1.2 * quantidade;
					}else if(codigo == 101) {
						output += "Bauru Simples -> 1.30 * " + quantidade;
						output += " = " + (1.3 * quantidade) + "\n";
						total += 1.3 * quantidade;
					}else if(codigo == 102) {
						output += "Bauru com ovos -> 1.50 * " + quantidade;
						output += " = " + (1.5 * quantidade) + "\n";
						total += 1.5 * quantidade;
					}else if(codigo == 103) {
						output += "Hamburguer -> 1.20 * " + quantidade;
						output += " = " + (1.2 * quantidade) + "\n";
						total += 1.2 * quantidade;
					}else if(codigo == 104) {
						output += "Cheeseburguer -> 1.30 * " + quantidade;
						output += " = " + (1.3 * quantidade) + "\n";
						total += 1.3 * quantidade;
					}else if(codigo == 105) {
						output += "Refrigerante -> 1.00 * " + quantidade;
						output += " = " + (1 * quantidade) + "\n";
						total += 1 * quantidade;
					}
				}				
					
		}while(naoTerminar);
		
		System.out.println(output);

	}
}
