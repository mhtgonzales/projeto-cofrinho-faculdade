package Uninter;

public class Euro {

	private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	void adicionarEuro(double moeda) {
		valor = valor() + moeda;
	}

	void removerEuro(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Euros = €%.2f%n", valor);
	}

	// metodo para converter os dolares registrados em reais
	double converter() {
		// euro na cotação atual = €1 => R$5,51
		double converterEurosParaReais = valor() * 5.51;
		
		return converterEurosParaReais;
		
	}
}
