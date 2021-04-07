package aula04;

public class Escritorio {
	
	public void main(String[] args) {
		
		Arquiteto oscar = new Arquiteto("Oscar Niemeyer", 104);
		Arquiteto kengo = new Arquiteto("Kengo Kuma", 64);
		
		desenhar(oscar, 2.0, 5.2, 3.7);
		desenhar(kengo, 7.5, 4.0, 9.6);
	}
	
	private void desenhar(Arquiteto arq, double d,
								double e, double f) {
		arq.exibeDadosPessoais();
		arq.trabalhe(d,e,f);
		
		
		
		}
	
	

}
