package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Farenheit: ");
		double farenheit = scan.nextDouble();
		
			double celsius = (5 * (farenheit - 32)) / 9;
			
			System.out.println("Graus em Celsius: " + celsius);
	}
}
