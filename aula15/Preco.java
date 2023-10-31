package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Preco {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro preco: ");
		double primeiroPreco = scan.nextDouble();
		
		System.out.println("Segundo preco: ");
		double segundoPreco = scan.nextDouble();
		
		System.out.println("Terceiro preco: ");
		double terceiroPreco = scan.nextDouble();
		
			if(primeiroPreco <= segundoPreco && primeiroPreco <= terceiroPreco) {
				System.out.println("Compre o produto 1");	
			}else if(segundoPreco <= segundoPreco && segundoPreco <= terceiroPreco) {
				System.out.println("Compre o produto 2");
			}else if(terceiroPreco <= primeiroPreco && terceiroPreco <= segundoPreco) {
				System.out.println("Compre o produto 3");
			}
	}
}
