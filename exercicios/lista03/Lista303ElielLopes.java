package br.com.rd.queroserdev.exercicios.lista03;

import java.util.Arrays;
import java.util.Scanner;

public class Lista303ElielLopes {

	public static void main(String[] args) {
		
		/*
		 * 3. Faca uma programa com um array que recebe do usuario 10 numeros reais.
		 * Calcule o quadrado de cada elemento deste array e armazene estes valores
		 * calculados em outro array. Exiba na tela os valores dos dois arrays.
		 */
		
		double array[] = new double[10];
		double quadrado[] = new double[array.length];
		
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite 10 valores:");
			
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
				quadrado[i] = Math.pow(array[i], 2);
			}
			
			System.out.println("Valores do primeiro array: " + Arrays.toString(array));
			System.out.println("Valores do primeiro array ao quadrado: " + Arrays.toString(quadrado));
			
		scan.close();

	}

}
