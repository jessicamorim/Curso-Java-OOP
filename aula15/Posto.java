package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade Litros vendidos: ");
		double quantidadeLitro = scan.nextDouble();
		System.out.println("Tipo de combustivel:?");
		String combustivel = scan.next();
		
		double precoGas = 2.5;
		double precoAlcool = 1.9;
		double total = 0;
		double totalDesconto = 0;
		int percentualDesconto = 0;
		
		
			if(combustivel.equalsIgnoreCase("a")) {
				
				if(quantidadeLitro <= 20) {
					percentualDesconto = 3;
				}else {
					percentualDesconto = 5;
				}
				
				total = quantidadeLitro * precoAlcool;
				
			}else if(combustivel.equalsIgnoreCase("g")) {
				
				if(quantidadeLitro <= 20) {
					percentualDesconto = 4;
				}else {
					percentualDesconto = 6;
				}
				
				total = quantidadeLitro * precoGas;		
			}
			
			totalDesconto = (total / 100) * percentualDesconto;
			double precoPagar = total - totalDesconto;
			
			System.out.println("Valor a ser pago: " + precoPagar);	
	}
}
