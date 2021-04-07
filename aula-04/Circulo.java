package aula04;

public class Circulo {
	
	private static double PI = 3.141592;
	private double raio;
	
	public Circulo(double r) {
	raio = r;
	}
	public double area( ) {
	return PI * raio * raio;
	}
	public double perimetro( ) {
	return 2 * PI * raio;
	}
	
		
}
