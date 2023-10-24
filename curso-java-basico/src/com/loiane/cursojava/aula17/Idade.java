package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade Idade: ");
		int idades = scan.nextInt();
		
		int idade;
		int soma = 0;
		
		for(int i=0; i < idades; i++) {
			
			System.out.println("Idade da pessoa: " + (i + 1) );
			idade = scan.nextInt();
			
			soma += idade;
			
		}
			
			double media = soma / idades;
			
			System.out.println("Media de idade: " + media);	
			
				
				if(media >= 0 && media <= 25) {
					System.out.println("jovem");					
				}else if(media >= 26 && media <= 60) {
					System.out.println("adulta");	
				}else if(media > 60) {
					System.out.println("idosa");	
				}			
	}
}
