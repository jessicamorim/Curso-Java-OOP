package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Horas Trabalhadas: ");
		double horasTrabalhadas = scan.nextDouble();
		
			double totalSalario = valorHora * horasTrabalhadas;
			double impostoRenda = (totalSalario * 1.11) - totalSalario; 
			double inss = (totalSalario * 1.08) - totalSalario; 
			double sindicato = (totalSalario * 1.05) - totalSalario; 
			double salarioLiquido = totalSalario - (impostoRenda + inss + sindicato);
			
			System.out.println("O salario bruto e: " + totalSalario);
			System.out.println("O desconto inss e: " + inss);
			System.out.println("O desconto do sindicato: " + sindicato);
			System.out.println("O salario liquido: " + salarioLiquido);
	}
}
