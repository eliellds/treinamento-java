package br.com.rd.queroserdev.exercicios.heranca;

public class Equipamento {
	
	private String marca;
	private float preco;
	
	public Equipamento( String marca, float preco) {
		this.marca = marca;
		this.preco = preco;
	}
	
	public String exibirDados() {
		return "Marca: " + this.getMarca() + "\n" 
				+ "Preço: R$" + this.getPreco();
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
