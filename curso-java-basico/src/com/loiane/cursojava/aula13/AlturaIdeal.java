package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class AlturaIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O peso ideal: " + pesoIdeal);
	}
}
