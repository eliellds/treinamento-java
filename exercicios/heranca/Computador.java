package br.com.rd.queroserdev.exercicios.heranca;

/* Crie uma classe computador com dois atributos a sua escolha, também privados. 
 * A classe computador deverá fazer herança da classe equipamento.
 * Crie os métodos de acesso para os atributos de todas as classes.
 * Crie um método exibir na classe computador para exibir os dados desta classe,
 * aproveitando o método que está escrito na superclasse.
 */

public class Computador extends Equipamento {
	
	private boolean portatil;
	private String sistemaOperacional;
	
	public Computador(String marca, float preco, boolean portatil, String sistemaOperacional) {
		super(marca, preco);
		this.portatil = portatil;
		this.sistemaOperacional = sistemaOperacional;
	}
	
	public String exibirDados() {
		return super.exibirDados() + "\n" 
				+ "Portatil: " + this.isPortatil() + "\n" 
				+ "SO: " + this.getSistemaOperacional();
	}

	public boolean isPortatil() {
		return portatil;
	}

	public void setPortatil(boolean portatil) {
		this.portatil = portatil;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}	

}
