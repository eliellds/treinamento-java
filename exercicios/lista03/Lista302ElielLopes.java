package br.com.rd.queroserdev.exercicios.lista03;

import java.util.Scanner;

public class Lista302ElielLopes {

	public static void main(String[] args) {
		
		/*
		 * 2. Faca um programa que contenha um array chamado A e que receba do usuario 6
		 * valores inteiros. O programa deve executar os seguintes passos: 
		 * -Atribuir os seguintes valores ao array: 1, 0, 5, -2, -5, 7. 
		 * -Armazene em uma variavel do tipo inteira a soma dos valores das 
		 * seguintes posicoes do array: A[0], A[1] e A[5] mostre o valor desta soma na tela. 
		 * -Mostre na tela cada elemento do array sendo um valor em cada linha. 
		 * --Use somente uma instrucao System.out.println para realizar este procedimento.
		 */

		int a[] = new int[6];
		
		Scanner scan = new Scanner(System.in);
		
			int soma = 0;
			System.out.println("Digite 6 valores inteiros:");
			
			for (int i = 0; i < a.length; i++) {
				a[i] = scan.nextInt();
				if (i == 0 || i == 1 || i == 5) {
					soma = soma + a[i];
				}
			}
			
		scan.close();
			
		System.out.println("\nSoma das posicões a[0], a[1] e a[5] = " + soma + "\n\nElementos do array:");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
