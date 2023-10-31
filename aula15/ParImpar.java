package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
			if(numero % 2 == 0) {
				System.out.println("par");	
			}else {
				System.out.println("impar");
			}
	}
}
