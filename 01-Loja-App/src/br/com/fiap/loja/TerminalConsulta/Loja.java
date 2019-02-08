package br.com.fiap.loja.TerminalConsulta;

import java.time.LocalDate;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		int codigo;
		
		Scanner entrada = new Scanner(System.in);
		LocalDate hoje = LocalDate.now();
		
		System.out.println("Camisetas foda!!!");
		System.out.println(hoje);
		System.out.println("");
		System.out.print("Digite o codigo da camisa: ");
		codigo = entrada.nextInt();
		
		if (codigo == 401) {
			System.out.println("Camiseta Branca");
		}
		else if (codigo == 402) {
			System.out.println("Camiseta Azul");
		}
		else if (codigo == 403) {
			System.out.println("Camiseta Rosa");
		}
		else {
			System.out.println("Produto não encontrado!");
		}
		entrada.close();
	}
	
}
