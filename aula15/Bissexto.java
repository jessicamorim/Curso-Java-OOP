package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ano: ");
		int ano = scan.nextInt();
		
			if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
				System.out.println("e bissexto");
			}else {
				System.out.println("nao e bissexto");
			}
	}

}
