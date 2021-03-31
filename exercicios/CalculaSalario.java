package exercicios;
import java.util.Scanner;

/*
 * Faça um programa que receba o valor do salário de um funcionário
 * e o percentual de aumento, calcule e mostre o valor do aumento e
 * o novo salário.
 */


public class CalculaSalario {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o salário: ");
		double valorSalario = leitor.nextDouble();
		
		System.out.println("Informe o percentual de aumento em % (0-100): ");
		double percentAumento = leitor.nextDouble();
		
		
		double valorAumento = valorSalario * (percentAumento/100);
		double novoSalario = valorAumento + valorSalario;
		
		System.out.println("Valor aumento: " + valorAumento);
		System.out.println("Novo salário: " + novoSalario);

	}

}
