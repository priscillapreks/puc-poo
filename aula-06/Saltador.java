package aula06_heranca;

public class Saltador extends Atleta {
	private int altura;
	
	public Saltador(String nome, int numero, int altura){
		super(nome, numero);
		this.altura = altura;
	}
	
	public void exibir() {
		super.imprimir();
		System.out.println(altura);
	}
	
	public void saltar(int altura) {
		this.altura = altura;
		}


}
