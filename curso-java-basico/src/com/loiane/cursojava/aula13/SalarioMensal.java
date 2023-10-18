package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class SalarioMensal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Horas Trabalhadas: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double totalSalario = valorHora * horasTrabalhadas;
		
		System.out.println("O salario total sera: " + totalSalario);

	}

}
