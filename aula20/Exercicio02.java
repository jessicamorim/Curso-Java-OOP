package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		
	int [][] numeroAleatorios = new int [10][10];
		
		Random numeroRandom = new Random();
		
			for(int i = 0; i < numeroAleatorios.length; i++){
				for(int j = 0; j < numeroAleatorios.length; j++){
					numeroAleatorios[i][j] = numeroRandom.nextInt(100);	
				}	
			}
			
			for(int i = 0; i < numeroAleatorios.length; i++){
				for(int j = 0; j < numeroAleatorios[i].length; j++){
					System.out.print(numeroAleatorios[i][j] + " ");
				}
				System.out.println();
			}
			
			int maiorL5 = 0;
			int menorL5 = 0;
			int linha5 = 5;
			for(int i = 0; i < numeroAleatorios[linha5].length; i++){
				if(numeroAleatorios[linha5][i] > maiorL5){
					maiorL5 = numeroAleatorios[linha5][i];	
				}
				if(numeroAleatorios[linha5][i] < maiorL5){
					menorL5 = numeroAleatorios[linha5][i];	
				}	
			}
			
			System.out.println("Maior valor da linha 5 = " + maiorL5);
			System.out.println("Menor valor da linha 5 = " + menorL5);
			
			int maiorC7 = 0;
			int menorC7 = 0;
			int coluna7 = 7;
			for(int i = 0; i < numeroAleatorios.length; i++){
				if(numeroAleatorios[i][coluna7] > maiorC7){
					maiorC7 = numeroAleatorios[i][coluna7];	
				}
				if(numeroAleatorios[i][coluna7] < menorC7){
					menorC7 = numeroAleatorios[i][coluna7];	
				}	
			}
			
			System.out.println("Maior valor da coluna 7 = " + maiorC7);
			System.out.println("Menor valor da coluna 7 = " + menorC7);
			
	}
}
