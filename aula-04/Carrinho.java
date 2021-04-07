package aula04;

public class Carrinho {
	
	private static int maximo = 5;
	private static int quantidade = 2;
	private static int inseridos = 2;
	private static int removidos = 1;
	private static double preco_unitario = 10.00;
	
	public static void inserir(){
	
		assert (quantidade < maximo); //PRE-CONDICAO
	
		quantidade++;
		inseridos++;
	
		assert (quantidade == inseridos - removidos); // INVARIANTE
	}
	
	public static void remover(){
	
		assert(quantidade > 0); // PRE-CONDICAO
	
		quantidade--;
		removidos++;
	
		assert (quantidade == inseridos - removidos); // INVARIANTE
	}
	
	public static int quantidade(){
	
		return quantidade;
	}
	
	public static double totalizar(double preco_maximo){
	
		double preco_total = preco_unitario * quantidade;
	
		assert (preco_total <= preco_maximo); // POS-CONDICAO
	
		return preco_total;
	}
	
	
}
