package br.com.rd.queroserdev.exercicios.lista03;

import java.util.Arrays;
import java.util.Scanner;

public class Lista304ElielLopes {
	
	public static void main(String[] args) {
		
		/*
		 * 4. Faca um programa com um array de 8 posicoes que receba 8 valores reais do
		 * usuario. Em seguida o usuario fornece duas posi��es X e Y do array. Exiba na
		 * tela o conteudo do array e a soma dos valores destas duas posi��es.
		 */
		
		double array[] = new double[8];
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Digite 8 valores:");
			
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}
			
			System.out.println("Escolha duas posi��es do array:");
			int x = scan.nextInt();
			int y = scan.nextInt();
			double soma = array[x] + array[y];
			
			System.out.println("Conte�do do array: " + Arrays.toString(array));
			System.out.println("Soma das posi��es " + x + " e " + y + " = " + soma);
			
		scan.close();
					
	}

}
