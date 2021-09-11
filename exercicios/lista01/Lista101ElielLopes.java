package br.com.rd.queroserdev.exercicios.lista01;
/*1. Criar um programa que leia a temperatura em Fahrenheit e converta para
Celsius.*/

public class Lista101ElielLopes {

	public static void main(String[] args) {
		
		double f = 98.6;
		double c = ((f - 32) * 5 / 9);
		
		System.out.println(f + "F = " + c + "C");
		
	}
	
}
