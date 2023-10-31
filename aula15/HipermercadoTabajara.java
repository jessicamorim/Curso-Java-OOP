package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class HipermercadoTabajara {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Carne:");
		System.out.println("1 - file duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");	
		int carne = scan.nextInt();
		

		System.out.println("Quantidade (Kg): ");
		double quantidade = scan.nextDouble();
		
		double precoKg = 0;
		
			if(carne == 1) {
				
				System.out.println(quantidade + "(Kg) - file duplo ");
				
				if(quantidade < 5) {	
					precoKg = 4.9;
				}else {
					precoKg = 5.8;
				}
			}else if(carne == 2) {
				
				System.out.println(quantidade + "(Kg) - alcatra ");
				
				if(quantidade < 5) {	
					precoKg = 5.9;
				}else {
					precoKg = 6.8;
				}
			}else if(carne == 3) {
				
				System.out.println(quantidade + "(Kg) - picanha ");
				
				if(quantidade < 5) {	
					precoKg = 6.9;
				}else {
					precoKg = 7.8;
				}
			}
			
			double total = quantidade * precoKg;
			System.out.println(quantidade + "(Kg) * " + precoKg + " = " + total);
			
			System.out.println("Cartao de credito - digite 1: ");
			int cartao = scan.nextInt();
			
				if(cartao == 1) {
					double desconto = (total / 100) * 5;
					System.out.println("Desconto de: " + desconto);
					System.out.println("Valor a pagar: " + (total - desconto));	
				}else {
					System.out.println("Valor a pagar: " + total);	
				}
	}
}
