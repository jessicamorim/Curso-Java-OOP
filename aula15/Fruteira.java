package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Fruteira {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade morango(Kg): ");
		int quantidadeMorango = scan.nextInt();
		System.out.println("Quantidade maca(Kg): ");
		int quantidadeMaca = scan.nextInt();
		
			double precoKgMorango = 0;
			
			if(quantidadeMorango <= 5) {
				precoKgMorango = 2.5;		
			}else {
				precoKgMorango = 2.2;	
			}
			
			double precoKgMaca = 0;
			
			if(precoKgMaca <= 5) {
				precoKgMaca = 1.8;		
			}else {
				precoKgMaca = 1.5;	
			}
			
			double  precoTotalMorango =  quantidadeMorango * precoKgMorango;
			double precoTotalMaca = quantidadeMaca *  precoKgMaca;
			
			double precoParcial = precoKgMorango + precoKgMaca;
			double precoTotal = precoParcial;
			
				if((quantidadeMorango + quantidadeMaca > 8) || precoParcial > 25) {
					precoTotal = precoParcial - ((precoParcial / 100) * 10);
				}
				
				System.out.println("Preco Total: " + precoTotal);
			
			
	}

}
