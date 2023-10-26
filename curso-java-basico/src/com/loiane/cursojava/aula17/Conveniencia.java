package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Conveniencia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Lojas Tabajara");
		
		boolean sair = false;
		String continuarCompra;
		int quantidadeProduto;
		double preco;
		double total;
		String output;
		double valorPago;
		double troco;
		
		do {
			
			System.out.println(" Nova compra? S/N: ");
			continuarCompra = scan.next();
			
				if(continuarCompra.equalsIgnoreCase("s")) {
					
					output = " Lojas Tabajara \n ";
					
					System.out.println(" Quantidade de produtos para compra: ");	
					quantidadeProduto = scan.nextInt();
					
					total = 0;
					
					for(int i=1; i <= quantidadeProduto; i++) {
						
						System.out.println(" Preco produto: " + i);	
						preco = scan.nextDouble();
						total += preco;
						output += " Produto" + i + ": R$ " + preco + "\n";
					}
					
					output += " Total: R$" + total;
					System.out.println("Total R$" + total);	
					
					System.out.println("Valor pago: ");	
					valorPago = scan.nextDouble();
					
					output += " Dinheiro: R$" + valorPago + "\n";
					
					troco = total - valorPago;
					
					output += " Troco: R$ " + troco;
					
					System.out.println(output);	
															
				}else {
					sair = true;
				}					
		}while(!sair);
	}
}
