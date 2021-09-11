package br.com.rd.queroserdev.exercicios.lista02;
import java.util.Random;
import java.util.Scanner;

/*6. Jogo da adivinhacao: Tentar adivinhar um nuumero entre 0 - 100. Armazene
um numero aleatorio em uma variavel. O Jogador tem 10 tentativas para
adivinhar o numero gerado. Ao final de cada tentativa, imprima a quantidade de
tentativas restantes, e imprima se o numero inserido eh maior ou menor do que o
numero armazenado.*/

public class Lista206ElielLopes {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
			Random numeroAleatorio = new Random();
			int numeroSorteado = numeroAleatorio.nextInt(101);
			int tentativas = 10;
			
			System.out.println("O sistema sorteou um número de 0 a 100, tente advinhar: ");
			int chute = scan.nextInt();
			
			while (true) {
				if (chute < numeroSorteado) {
					--tentativas;
					if (tentativas == 0) {
						System.out.println("Tentativas esgotadas. O número sorteado era: " + numeroSorteado);
					} else {
					System.out.println("Você errou! Você tem " + tentativas + " tentativas restantes.\n"
							+ "O número sorteado é maior que o chute. Tente novamente: ");
					chute = scan.nextInt();
					}
				} else if (chute > numeroSorteado) {
					--tentativas;
					if (tentativas == 0) {
						System.out.println("Tentativas esgotadas. O número sorteado era: " + numeroSorteado);
					} else {
					System.out.println("Você errou! Você tem " + tentativas + " tentativas restantes.\n"
							+ "O número sorteado é menor que o chute. Tente novamente: ");
					chute = scan.nextInt();
					}
				} else {
					System.out.println("Você acertou!\nNúmero sorteado: " + numeroSorteado);
					break;
				}
			}
			
		scan.close();
		
	}

}
