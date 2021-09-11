package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Scanner;

/*7. Criar um programa que enquanto estiver recebendo numeros positivos,
imprime no console a soma dos numeros inseridos, caso receba um numero
negativo, encerre o programa. Tente utilizar a estrutura do while.*/

public class Lista207ElielLopes {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
			int soma = 0;
			int numero = 0;
			
			System.out.println("Os números digitados serão somados.\n");
			
			do {
				numero = scan.nextInt();
				if (numero > 0) {
					soma += numero;
					System.out.println("Soma até o momento: " + soma);
					System.out.println("Digite 0 ou número negativo para sair.");
				}
			} while (numero > 0);
				
			System.out.println("\nNúmero negativo ou 0 digitado. Soma total: " + soma 
					+ "\nPrograma encerrado.");
			
			
		scan.close();
			
	}

}
