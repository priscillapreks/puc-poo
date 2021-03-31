//AULA 01: Classes: atributos e invocação de métodos
package aula01;

public class ClienteCalculadora {

	public static void main(String[] args) {
		
		// INVOCA METODOS DA CLASSE STATIC Calculadora 
		
		int z = Calculadora.soma(5,  8);
		System.out.println(z);
		
		System.out.println( Calculadora.subtrai(5, 8));
		
		System.out.println( Calculadora.soma(10, 5));
		
		// EXIBE ATRIBUTOS STATIC DA CLASSE Calculadora
		
		System.out.println("Numero de adições = " + Calculadora.contadorAdicao);
		
		System.out.println("Numero de subtrações = " + Calculadora.contadorSubtracao);

	}

}
