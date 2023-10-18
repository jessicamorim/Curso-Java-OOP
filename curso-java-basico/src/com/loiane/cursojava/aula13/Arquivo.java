package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Arquivo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tamanho arquivo: ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Velocidade Internet: ");
		double velocidadeInternet = scan.nextDouble();
		
		double tempoAproximado = tamanhoArquivo / (velocidadeInternet / 8);
		double tempoMinuto = tempoAproximado * 60;
		
		System.out.println("Tempo aproximado de download e: " + tempoMinuto);
	}
}
