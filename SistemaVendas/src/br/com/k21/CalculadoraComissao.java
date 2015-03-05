package br.com.k21;

public class CalculadoraComissao {

	private static final double FAIXA1 = 0.05;

	public static double calcular(double venda) {
		return venda * FAIXA1;
	}
	
}
