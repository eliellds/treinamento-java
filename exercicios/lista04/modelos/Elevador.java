package br.com.rd.queroserdev.exercicios.lista04.modelos;

/*3. Crie uma classe elevador para armazenar as informações de um elevador de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares do prédio,
excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele.
A classe deve disponibilizar os seguintes méltodos:
• inicializar: deve receber como parâmetros a capacidade do elevador, e o total de
andares do prédio (os elevadores sempre começam no térreo e vazios);
• entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
tiver espaço);
• sair: para remover uma pessoa do elevador (só deve remover se existir alguém
dentro do elevador);
• subir: para subir um andar (não deve subir se já estiver no último andar);
• descer: para descer um andar (não deve descer se já estiver no térreo);
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
