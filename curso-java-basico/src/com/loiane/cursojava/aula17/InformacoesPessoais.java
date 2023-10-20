package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class InformacoesPessoais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do{
		
			System.out.println("Nome: ");
			nome = scan.next();
		
				if(nome.length() >= 3) {
					infoValida = true;					
				}else{
					System.out.println("Nome precisa no minimo 3 caracteres. ");
				}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
		
				if(idade >= 0 && idade <= 150) {
					infoValida = true;					
				}else{
					System.out.println("Idade precisa ser entre 0 e 150. ");
				}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			
			System.out.println("Salario: ");
			salario = scan.nextDouble();
		
				if(salario > 0) {
					infoValida = true;					
				}else{
					System.out.println("Salario precisa ser maior que 0. ");
				}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			
			System.out.println("Sexo: ");
			sexo = scan.next();
		
				if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
					infoValida = true;					
				}else{
					System.out.println("Sexo precisa ser 'f' ou 'm'. ");
				}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			
			System.out.println("Estado Civil: ");
			estadoCivil = scan.next();
		
				if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
						|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
					infoValida = true;					
				}else{
					System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'. ");
				}
		}while(!infoValida);
		
		System.out.println("As seguintes informações foram coletadas. ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
	}
}


