package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class MediaBimestral {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Nota: ");
		double primeiroNota = scan.nextDouble();
		System.out.println("Segundo Nota: ");
		double segundaNota = scan.nextDouble();
		System.out.println("Terceiro Nota: ");
		double terceiraNota = scan.nextDouble();
		System.out.println("Segundo Numero: ");
		double quartaNota = scan.nextDouble();
		
			double media = (primeiroNota + segundaNota + terceiraNota + quartaNota) / 4;
			
			System.out.println("A media dos numeros e: " + media);
			
	}
}
