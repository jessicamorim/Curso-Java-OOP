package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Celsius: ");
		double celsius = scan.nextDouble();
		
		double farenheit = celsius * 1.8 + 32;
		
		System.out.println("Graus em Farenheit: " + farenheit);
	}
}
