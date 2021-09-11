package br.com.rd.queroserdev.exercicios.lista04;

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
			System.out.println("Estamos no último andar.");
		}
	}
	
	public void descer() {
		if (andarAtual > 0) {
			this.andarAtual--;
		} else {
			System.out.println("Estamos no térreo.");
		}
	}
	

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
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
