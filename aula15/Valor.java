package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Valor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
			if(numero >= 0) {
				System.out.println("Numero positivo");	
			}else {
				System.out.println("Numero negativo");	
			}
	}

}
