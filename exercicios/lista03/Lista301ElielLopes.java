package br.com.rd.queroserdev.exercicios.lista03;
import java.util.Scanner;

public class Lista301ElielLopes {
	
	/*1. Criar um programa que receba uma palavra e imprime no console letra
	por letra.*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
			System.out.print("Insira uma palarva: ");
			String palavra = scan.nextLine();
			
			for (int i = 0; i < palavra.length(); i++) {
				System.out.println(palavra.charAt(i));
			}

		scan.close();
		
	}

}
