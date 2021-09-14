package br.com.rd.queroserdev.exercicios.lista04.modelos;

/*3. Crie uma classe elevador para armazenar as informa��es de um elevador de um
pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares do pr�dio,
excluindo o t�rreo, capacidade do elevador, e quantas pessoas est�o presentes nele.
A classe deve disponibilizar os seguintes m�ltodos:
� inicializar: deve receber como par�metros a capacidade do elevador, e o total de
andares do pr�dio (os elevadores sempre come�am no t�rreo e vazios);
� entrar: para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda
tiver espa�o);
� sair: para remover uma pessoa do elevador (s� deve remover se existir algu�m
dentro do elevador);
� subir: para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
� descer: para descer um andar (n�o deve descer se j� estiver no t�rreo);
Encapsular todos os atributos da classe.*/

public class Elevador {
	
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;
	
	public Elevador(int capacidade, int totalAndares) {
		if (capacidade <= 0 || totalAndares <= 0) {
			System.out.println("Capacidade de pessoas e total de andares devem ser maior que ZERO.");
		} else {
			this.andarAtual = 0;
			this.qtdPessoas = 0;
			this.capacidade = capacidade;
			this.totalAndares = totalAndares;
		}
	}
	
	public void entrar() {
		if (this.capacidade <= 0) {
			System.out.println("Inicialize o elevador primeiro.");
		} else if (this.qtdPessoas < this.capacidade) {
			this.qtdPessoas++;
		} else {
			System.out.println("Elevador cheio.");
		}
	}
	
	public void sair() {
		if (this.qtdPessoas > 0) {
			this.qtdPessoas--;
		} else {
			System.out.println("Elevador vazio.");
		}
	}
	
	public void subir() {
		if (andarAtual < totalAndares) {
			this.andarAtual++;
		} else {
			System.out.println("Estamos no �ltimo andar.");
		}
	}
	
	public void descer() {
		if (andarAtual > 0) {
			this.andarAtual--;
		} else {
			System.out.println("Estamos no t�rreo.");
		}
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
}
