package br.com.rd.queroserdev.exercicios.lista01;
/*4. Criar um programa que leia um valor e apresente os resultados ao
quadrado e ao cubo do valor.*/

public class Lista104ElielLopes {
	
	public static void main(String[] args) {
		
		double base = 4;
		double quadrado = Math.pow(base, 2);
		double cubo = Math.pow(base, 3);
		
		System.out.println(base + "² = " + quadrado);
		System.out.println(base + "³ = " + cubo);
		
	}

}
