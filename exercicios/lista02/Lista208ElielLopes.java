package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Scanner;

/*8. Crie um programa que recebe 10 valores e ao final imprima o maior numero.*/

public class Lista208ElielLopes {
	
	public static void main(String[] args) {
		
		int maior = 0;
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("O programa ir� imprimir o maior n�mero dentre os 10 digitados.\n");
			
			do {
				int numero = scan.nextInt();
				if (maior < numero) {
					maior = numero;
					contador++;
				} else {
					contador++;
				}
			} while (contador < 10);
			
			System.out.println("\nO maior n�mero digitado foi: " + maior + "\nPrograma encerrado.");
			
		scan.close();
		
	}

}
