package TDD.calculadora.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import TDD.calculadora.calculadora.Calculadora;

public class CalculadoraTeste {
	@Test
	public void deveriaSomarDoisValores() throws Exception{
		int valorA = 1;
		int valorB = 2;
				
		//implementando a funcionalidade
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);
		
		//o resultado que queremos
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisValores() throws Exception{
		int valorA = 1;
		int valorB = 2;
		
		//implementando a funconalidade
		Calculadora calculadora = new Calculadora();
		int subtracao = calculadora.subtrai(valorA, valorB);
		
		//o resultado que queremos
		assertEquals(-1, subtracao);
	}
	
	@Test
	public void deveriaDividirDoisNumeros() throws Exception{
		int valorA = 6;
		int valorB = 3;
		
		//implementando a funcionalidade
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divide(valorA, valorB);
		
		assertEquals(2, divisao);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarUmaExcecaoNaDivisaoPorZero() {
		int valorA = 6;
		int valorB = 0;
		
		//implementando
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divide(valorA, valorB);
		
		assertEquals(0, divisao);
	}

}
