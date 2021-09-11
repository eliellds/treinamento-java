package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Scanner;

/*1. Criar um programa que receba um numero e verifique se ele esta entre 0 e 10
e se ele eh um numero par;*/


public class Lista201ElielLopes {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			
			System.out.print("Digite um número: ");
			int numero = s.nextInt();
			
			if (numero >= 0 && numero <= 10) {
				if (numero % 2 == 0) {
					System.out.println("O número " + numero + " está entre 0 e 10 e é par");
				} else {
					System.out.println("O número " + numero + " está entre 0 e 10 e não é par");
				}
			} else {
				System.out.println("O número " + numero + " não está entre 0 e 10");
				System.out.print("Digite um número: ");
				numero = s.nextInt();
			}
		
		s.close();
		
	}

}
