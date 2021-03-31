//AULA 01: Classes: atributos e invocação de métodos
package aula01;

public class Calculadora {

	static int contadorAdicao;
	static int contadorSubtracao;

	static int soma (int a, int b)
	{
		contadorAdicao++;
		return a + b;
	}
	
	static int subtrai (int a, int b)
	{
		contadorSubtracao++;
		return a - b;
	}	
}
