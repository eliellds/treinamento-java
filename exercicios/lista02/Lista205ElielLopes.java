package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Scanner;

/*5. Refatorar o exerciicio 04, utilizando a estrutura switch.*/

public class Lista205ElielLopes {
	
	public static void main(String[] args) {
		
		Scanner sPrimo = new Scanner(System.in);
		
			System.out.print("Digite um número: ");
			int numero = sPrimo.nextInt();
		
		sPrimo.close();
		
		byte primo = 1;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = 0;
				break;
			}
		}
		
		switch(primo) {
		case 1:
			System.out.println("O número " + numero + " é primo");
			break;
		default:
			System.out.println("O número " + numero + " não é primo");
			break;
		}
		
	}

}
