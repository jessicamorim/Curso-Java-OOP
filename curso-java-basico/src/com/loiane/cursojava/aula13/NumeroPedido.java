package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class NumeroPedido {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int numeroPedido = scan.nextInt();
		System.out.println("O numero informado foi: " + numeroPedido);
		}
}
