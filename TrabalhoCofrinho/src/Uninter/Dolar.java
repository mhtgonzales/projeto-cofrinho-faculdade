package Uninter;

public class Dolar {
	private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	void adicionarDolar(double moeda) {
		valor = valor() + moeda;
	}

	void removerDolar(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Dolares = $%.2f%n", valor);
	}

	// metodo para converter os dolares registrados em reais
	double converter() {
		// dolar na cotação atual = $1 => R$5,50
		double converterDolaresParaReais = valor() * 5.5;
		
		return converterDolaresParaReais;
		
	}

}
