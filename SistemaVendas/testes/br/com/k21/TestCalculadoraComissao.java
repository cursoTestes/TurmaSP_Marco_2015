package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void calcularVendaDe1000Retornando50() {
		double venda = 1000;
		double esperado = 50;
		double valorRetornado = CalculadoraComissao.calcular(venda);
		
		assertEquals(esperado, valorRetornado,0);
	}
	
	
	@Test
	public void calcularVendaDe1Retornando05() {
		double venda = 1;
		double esperado = 0.05;
		double valorRetornado = CalculadoraComissao.calcular(venda);
		
		assertEquals(esperado, valorRetornado,0);
	}
	
	@Test
	public void calcularVendaDe10000Retornando500() {
		double venda = 10000;
		double esperado = 500;
		double valorRetornado = CalculadoraComissao.calcular(venda);
		
		assertEquals(esperado, valorRetornado,0);
	}
	
	@Test
	public void calcularVendaDe10050Retornando5025() {
		double venda = 100.50;
		double esperado = 5.025;
		double valorRetornado = CalculadoraComissao.calcular(venda);
		
		assertEquals(esperado, valorRetornado,0);
	}
	
	@Test
	public void calcularVendaDe55reais59centsRetornando2reais77cent() {
		double venda = 55.59;
		double esperado = 2.77;
		double valorRetornado = CalculadoraComissao.calcular(venda);
		
		assertEquals(esperado, valorRetornado,0);
	}
}
