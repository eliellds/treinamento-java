package br.com.rd.queroserdev.exercicios.lista01;
import java.util.Locale;
import java.util.Scanner;

/*3. Criar um programa que leia o peso e a altura do usuário e imprima no
console o IMC.*/

public class Lista103ElielLopes {
	
	public static void main(String[] args) {
		
		Scanner calcImc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
			System.out.print("Digite seu peso: ");
			float peso = calcImc.nextFloat();
			
			System.out.print("Digite sua altura: ");
			float altura = calcImc.nextFloat();
			
			float imc = peso / (altura * altura);
			System.out.println("IMC = " + imc);
		
		calcImc.close();
				
	}

}
