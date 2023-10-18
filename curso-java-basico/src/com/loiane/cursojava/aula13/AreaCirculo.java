package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Raio do Circulo: ");
		double raio = scan.nextDouble();
		
		double area = 3.14 * (raio * raio);
		
		System.out.println("A area do circulo e: " + area);
		}
}
