package Uninter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // instancia de scanner
		
		Cofrinho cofrinho = new Cofrinho(); // instancia de cofrinho
		
		System.out.printf("Cofrinho de moedas%n%n");
		
		while(true) {
		
			try {
			
				System.out.printf("Qual operação você deseja realizar? %n"
						+ "1 - Adicionar moeda(s) %n"
						+ "2 - Remover moeda(s) %n"
						+ "3 - Listar moedas %n"
						+ "4 - Converter todo o dinheiro para reais %n"
						+ "5 - Sair %n");
				
				int acao = scanner.nextInt();
				
				if(acao == 1) { // adicionar moedas
					
					System.out.printf("%nCom qual moeda você deseja trabalhar? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoMoeda = scanner.nextInt();
					
					System.out.printf("%nQuantas moedas você deseja adicionar?%n"
							+ "Separar casas decimais com vírgula!%n");
					double adicionarMoeda = scanner.nextDouble();
					
					cofrinho.adicionarMoedas(tipoMoeda, adicionarMoeda);
					
				} else if(acao == 2) { // remover moedas
					
					System.out.printf("%nCom qual moeda você deseja trabalhar? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoMoeda = scanner.nextInt();
					
					System.out.printf("%nQuantas moedas você deseja remover?%n"
							+ "Separar casas decimais com vírgula!%n");
					double removerMoeda = scanner.nextDouble();
					
					cofrinho.removerMoedas(tipoMoeda, removerMoeda);
					
				} else if(acao == 3) { // listar moedas
					
					System.out.println(); // quebra de linha
					cofrinho.listagemMoedas();
					
				} else if(acao == 4) { // converter dinheiro para reais
					
					System.out.println(); // quebra de linha
					cofrinho.totalConvertido();
					
				} else if(acao == 5) { // encerrar programa
					
					break;
					
				} else {
					
					System.out.println("Opção inválida");
				}
				
				System.out.println(); // quebra de linha
				
			} catch(InputMismatchException e) {
				/*
				 * se o usuario digitar algum valor numerico separado com . (ponto)
				 *  ao inves de , (virgula)
				 */
				
				System.out.printf("%nSeparar casas decimais com vírgula!%n");
				break; // encerra programa
			}
		}
		
		scanner.close();
		
		System.out.println(); // quebra de linha
		
		System.out.println("Programa encerrado");
	}

}
