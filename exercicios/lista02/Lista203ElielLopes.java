package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Locale;
import java.util.Scanner;

/*3. Criar um programa que receba duas notas parciais, calcular a media final. Se
a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a
nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperacao",
caso contrario imprime no console "Reprovado".*/


public class Lista203ElielLopes {
	
	public static void main(String[] args) {
		
		Scanner notas = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
			System.out.print("Insira a primeira nota: ");
			double notaUm = notas.nextFloat();
			System.out.print("Insira a segunda nota: ");
			double notaDois = notas.nextFloat();
			
		notas.close();
			
		double media = (notaUm + notaDois) / 2;
		System.out.println("Média final: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
