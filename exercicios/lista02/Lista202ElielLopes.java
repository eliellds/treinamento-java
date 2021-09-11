package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Scanner;

/*
 * Se o ano for uniformemente divis�vel por 4, v� para a etapa 2. Caso contr�rio, v� para a etapa 5.
 * Se o ano for uniformemente divis�vel por 100, v� para a etapa 3. Caso contr�rio, v� para a etapa 4.
 * Se o ano for uniformemente divis�vel por 400, v� para a etapa 4. Caso contr�rio, v� para a etapa 5.
 * O ano � bissexto (tem 366 dias).
 * O ano n�o � um ano bissexto (tem 365 dias).
 */

public class Lista202ElielLopes {
	public static void main(String[] args) {
		
		Scanner anoBissexto = new Scanner(System.in);
		
			System.out.print("Digite um ano: ");
			int ano = anoBissexto.nextInt();
			
		anoBissexto.close();
		
		boolean bissexto = false;
			
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)) {
			bissexto = true;				
		} else {
			bissexto = false;
		}
		
		if (bissexto) {
			System.out.println("O ano de " + ano + " � bissexto");
		} else {
			System.out.println("O ano de " + ano + " n�o � bissexto");
		}
			
	}
}
