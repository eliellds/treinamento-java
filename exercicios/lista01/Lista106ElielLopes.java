package br.com.rd.queroserdev.exercicios.lista01;
/*6. Criar um programa que resolve equações do segundo grau (ax2 + bx + c
= 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e
c = -13. Encontre o delta*/

public class Lista106ElielLopes {
	
	public static void main(String[] args) {
		
		double a = 1;
		double b = 12;
		double c = -13;
		double delta = Math.pow(b, 2) - (4 * a * c);
		double xP = (-b + Math.sqrt(delta)) / (2 * a);
		double xN = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("Delta = " + delta);
		System.out.println("x' = " + xP);
		System.out.println("x\" = " + xN);
		
	}

}
