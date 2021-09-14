package br.com.rd.queroserdev.exercicios.sobrecarga.modelos;

/* Crie uma classe Pessoa com os atributos: codigo, nome, idade;
 * Crie um m�todo exibir que imprima na tela todos os valores dos atributos;
 * Crie uma sobrecarga do m�todo exibir que receba como par�metro um n�mero inteiro e 
 * decida por meio desse par�metro se a idade ser� exibida ou n�o. 
 * Crit�rio:
 * � Se o valor do par�metro for igual a 1, imprima a idade e os valores dos demais  atributos;
 * � Sen�o n�o imprima a idade mas imprima os valores dos demais atributos;
 * Crie um construtor padr�o para a classe pessoa. 
 * Este construtor dever� exibir a mensagem �Construtor Padr�o�;
 * Crie um construtor sobrecarregado que permita instanciar um objeto passando os tr�s 
 * par�metros de uma s� vez;
 */

public class Pessoa {

	private int codigo;
	private String nome;
	private int idade;
	
	public Pessoa() {
		System.out.println("Construtor Padr�o");
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
		return "C�digo: " + this.codigo + "\n" 
				+ "Nome: " + this.nome + "\n" 
				+ "Idade: " + this.idade;
	}
	
	public String exibir(int numero) {
		
		if (numero == 1) {
			return "C�digo: " + this.codigo + "\n" 
					+ "Nome: " + this.nome + "\n" 
					+ "Idade: " + this.idade;
		} else {
			return "C�digo: " + this.codigo + "\n" 
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
