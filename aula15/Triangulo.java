package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lado A: ");
		int ladoA = scan.nextInt();
		System.out.println("Lado B: ");
		int ladoB = scan.nextInt();
		System.out.println("Lado C: ");
		int ladoC = scan.nextInt();
		
			if(((ladoA + ladoB) > ladoC) || 
					((ladoA + ladoC) > ladoB) ||
					((ladoB + ladoC) > ladoA)) {
				
				if(ladoA ==  ladoB && ladoA ==  ladoC && ladoB ==  ladoC) {
					System.out.println("Triangulo Equilatero");
				}else if(ladoA !=  ladoB && ladoA !=  ladoC && ladoB !=  ladoC) {
					System.out.println("Triangulo Escaleno");
				}else if(ladoA ==  ladoB || ladoA ==  ladoC || ladoB ==  ladoC) {
					System.out.println("Triangulo Isoceles");
				}
				
			}else {
				System.out.println("Nao forma um triangulo");
			}
		
		

	}

}
