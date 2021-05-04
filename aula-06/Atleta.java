package aula06_heranca;

public class Atleta {
	
	private String nome;
	private int numero;
	
	public Atleta(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
	}
	
	public void imprimir(){
		
		System.out.println(nome);
		System.out.println(numero);

	}
	
	public void trocarCamisa(int numero) {
		this.numero = numero;
		
	}

}
