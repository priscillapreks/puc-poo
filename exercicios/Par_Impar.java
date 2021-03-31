package exercicios;
import java.util.Scanner;


/* Faça um programa que leia 10 números inteiros e exiba
 * na tela a mensagem ‘Par’ se ele for um número par, ou
 * ‘Ímpar’ se ele for um número ímpar.
 */


public class Par_Impar {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		
		for (int i=0; i<10; i++){
			
			System.out.println("Informe o número: ");
			double numero = leitor.nextDouble();
			
			if ((numero % 2) == 0) {
				System.out.println("Par");
			}else {
				System.out.println("Ímpar");
			}
			
		}
				
	}

}
