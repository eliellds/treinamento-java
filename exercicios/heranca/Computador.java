package br.com.rd.queroserdev.exercicios.heranca;

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
