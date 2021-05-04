package aula06_heranca;

public class Competicao {
	
	public static void main(String[] args) {
		
		Atleta falcao = new Atleta ("Paulo Roberto Falcao", 5);
		Saltador sotomayor = new Saltador("Javier Sotomayor", 76, 245);
		Corredor bolt = new Corredor("Usain Bolt", 709, 37.58);
		
		falcao.imprimir();
		sotomayor.imprimir();
		sotomayor.exibir();
		bolt.imprimir();
		
		falcao.trocarCamisa(10);
		sotomayor.trocarCamisa(31);
		bolt.trocarCamisa(2163);
		
		sotomayor.saltar(233);
		bolt.correr(36.92);
		System.out.println("-------");
		
		falcao.imprimir();
		sotomayor.exibir();
		bolt.imprimir();
		}

}
