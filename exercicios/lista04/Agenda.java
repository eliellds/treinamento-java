package br.com.rd.queroserdev.exercicios.lista04;

public class Agenda {
	
	private Pessoa agenda[];
	
	public Agenda(int tamanhoAgenda) {
		if (tamanhoAgenda <= 0) {
			System.out.println("Tamanho da agenda deve ser maior que ZERO.");
		} else {
			this.agenda = new Pessoa[tamanhoAgenda];
		}
	}

	public Pessoa[] getAgenda() {
		return agenda;
	}

	public void armazenarPessoa(String nome, int idade, float altura) {
		for (int i = 0; i < this.agenda.length; i++) {
			if (this.agenda[i] == null) {
				this.agenda[i] = new Pessoa(nome, idade, altura);
				break;
			} else if (i == this.agenda.length-1 && this.agenda[i] != null) {
				System.out.println("Agenda cheia!\nRemova uma pessoa antes de adicionar uma nova.");
			}
		}
	}
	
	public void removerPessoa(String nome) {
		boolean encontrou = false;
		for (int i = 0; i < this.agenda.length; i++) {
			if (nome == this.agenda[i].getNome()) {
				this.agenda[i] = null;
				encontrou = true;
				break;
			}
		}
		if (encontrou == false) {
			System.out.println("Pessoa não encontrada");
		}
	}
	
	public int buscaPessoa(String nome) {
		int i = 0;
		boolean encontrou = false;
		do {
			if (this.agenda[i] == null) {
				i++;
			} else if (this.agenda[i].getNome() != nome) {
				i++;
			} else if (this.agenda[i].getNome() == nome) {
				encontrou = true;
				break;
			}
		} while (i < this.agenda.length);
		
		if (encontrou == true) {
			return i;
		} else {
			System.out.println("Pessoa não encontrada");
			return -1;
		}
	}
	 
	public void imprimirPessoa(int indice) {
		if (this.agenda[indice] == null) {
			System.out.println("Posição vazia");
		} else {
			System.out.println(this.agenda[indice].getDados());
		}
	}

}
