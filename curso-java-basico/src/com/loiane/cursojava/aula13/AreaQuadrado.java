package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Base: ");
		double base = scan.nextDouble();
		System.out.println("Altura: ");
		double altura = scan.nextDouble();
		
			double areaQuadrado = base * altura;
		
			System.out.println("A dobro da area do quadrado e: " + (areaQuadrado * 2));
	}
}
