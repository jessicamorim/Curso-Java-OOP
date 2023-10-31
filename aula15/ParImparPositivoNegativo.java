package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class ParImparPositivoNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro numero: ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Segundo numero: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Entre com a operacao (+ - / *): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
			switch(operacao) {
				case "+": resultado = primeiroNumero + segundoNumero; break;
				case "-": resultado = primeiroNumero - segundoNumero; break;
				case "*": resultado = primeiroNumero * segundoNumero; break;
				case "/": resultado = primeiroNumero / segundoNumero; break;
				default: 
					System.out.println("Operacao invalida"); 
					valida = false;
			}
			
			if(valida) {
				
				System.out.println("Resultado: " + resultado);
				
				if(resultado >= 0) {
					System.out.println("Resultado positivo");				
				}else {
					System.out.println("Resultado negativo");	
				}
				
				if(resultado % 2 == 0) {
					System.out.println("Resultado par");
				}else {
					System.out.println("Resultado impar");	
				}
			}	
	}
}
