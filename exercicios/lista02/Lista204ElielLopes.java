package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Scanner;

/*4. Criar um programa que receba um numero e diga se ele eh um numero primo.*/

public class Lista204ElielLopes {
	
	public static void main(String[] args) {
		
		Scanner sPrimo = new Scanner(System.in);
			
			System.out.print("Digite um número: ");
			int numero = sPrimo.nextInt();
			
		sPrimo.close();
			
		boolean primo = true;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}
		}
		
		if (primo == true) {
			System.out.println("O número " + numero + " é primo");
		} else {
			System.out.println("O número " + numero + " não é primo");
		}
			
	}

}
