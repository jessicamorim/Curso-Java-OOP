package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class MetrosCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Metro: ");
		double metro = scan.nextDouble();
		
		double centimetro = metro * 100;
		
		System.out.println("Valor em centimetros : " + centimetro);
	}

}
