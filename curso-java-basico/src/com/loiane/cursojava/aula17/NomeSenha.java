package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class NomeSenha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nome;
		String senha;
		
		do {
		
		System.out.println("Nome: ");
		nome = scan.next();
		System.out.println("Senha: ");
		senha = scan.next();
		
			if(nome.equals(senha)) {
				infoValidas = false;
				System.out.println("Senha igual a usuario, digite novamente. ");
			}else {
				infoValidas = true;
				System.out.println("Senha e usuario validos. ");
			}
	
		}while(!infoValidas);
	}
}
