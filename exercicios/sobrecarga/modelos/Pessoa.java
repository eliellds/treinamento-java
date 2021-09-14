package br.com.rd.queroserdev.exercicios.sobrecarga.modelos;

/* Crie uma classe Pessoa com os atributos: codigo, nome, idade;
 * Crie um método exibir que imprima na tela todos os valores dos atributos;
 * Crie uma sobrecarga do método exibir que receba como parâmetro um número inteiro e 
 * decida por meio desse parâmetro se a idade será exibida ou não. 
 * Critério:
 * • Se o valor do parâmetro for igual a 1, imprima a idade e os valores dos demais  atributos;
 * • Senão não imprima a idade mas imprima os valores dos demais atributos;
 * Crie um construtor padrão para a classe pessoa. 
 * Este construtor deverá exibir a mensagem “Construtor Padrão”;
 * Crie um construtor sobrecarregado que permita instanciar um objeto passando os três 
 * parâmetros de uma só vez;
 */

public class Pessoa {

	private int codigo;
	private String nome;
	private int idade;
	
	public Pessoa() {
		System.out.println("Construtor Padrão");
	}
	
	public Pessoa(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setAtributos(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String exibir() {
		return "Código: " + this.codigo + "\n" 
				+ "Nome: " + this.nome + "\n" 
				+ "Idade: " + this.idade;
	}
	
	public String exibir(int numero) {
		
		if (numero == 1) {
			return "Código: " + this.codigo + "\n" 
					+ "Nome: " + this.nome + "\n" 
					+ "Idade: " + this.idade;
		} else {
			return "Código: " + this.codigo + "\n" 
					+ "Nome: " + this.nome;
		}
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
