package br.com.rd.queroserdev.exercicios.lista04.modelos;

/*1. Crie uma classe que represente uma pessoa, com os atributos privados de nome, idade
e altura. Crie os métodos de acesso para esses atributos e também um método para
imprimir na tela os dados de uma pessoa.*/

public class Pessoa {
	
	private String nome;
	private int idade;
	private float altura;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	
	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			System.out.println("Preencha o campo corretamente.");
		}
	}
	
	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		} else {
			System.out.println("Cadastramos apenas pessoas a partir de 1 ano.");
		}
	}
	
	public void setAltura(float altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Preencha o campo corretamente.");
		}
	}
	
	public String getDados() {
		return "Nome: " + this.nome + "\n"
				+ "Idade: " + this.idade + " anos" + "\n"
				+ "Altura: " + this.altura + "m";
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public float getAltura() {
		return altura;
	}

}
