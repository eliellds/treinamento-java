package br.com.rd.queroserdev.exercicios.lista03;

import java.util.Scanner;

public class Lista305ElielLopes {
	
	public static void main(String[] args) {
		
		/*
		 * 5. Faca um programa com um array de 10 posicoes e que receba do usuario os
		 * valores para preenche-lo. Em seguida exiba na tela o maior e o menor valor do
		 * array.
		 */
		
		float array[] = new float[10];
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Digite 10 valores:");
		
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextFloat();
			}
			
		scan.close();
			
		float maior = array[0];
		float menor = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			} else if (array[i] < menor) {
				menor = array[i];
			}
		}
		
		System.out.println("Maior valor do array: " + maior);
		System.out.println("Menor valor do array: " + menor);
		
	}

}
