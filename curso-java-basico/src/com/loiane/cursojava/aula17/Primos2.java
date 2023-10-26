package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Primos2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		boolean primo;
		
			for(int i = 1; i <= numero; i++) {
				
				primo = true;
				
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						//System.out.println("Não é primo - divisivel por " + i);
						primo = false;
						//break;
					}		
				}
				
				if(primo) {
					System.out.println(i);
				
				}
				
			}

	}
}
