package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		boolean primo = true;
		
			for(int i = 2; i < numero; i++) {
				if(numero % i == 0) {
					System.out.println("Não é primo - divisivel por " + i);
					primo = false;
					break;
				}		
		}
			
			if(primo) {
				System.out.println("É numero primo");
			}

	}

}
