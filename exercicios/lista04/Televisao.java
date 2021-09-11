package br.com.rd.queroserdev.exercicios.lista04;

public class Televisao {

	private int qtdCanais;
	private int volumeMaximo = 100;
	private int canalAtual = 1;
	private int volumeAtual = 0;
	
	public Televisao(int qtdCanais) {
		if (qtdCanais < 1) {
			System.out.println("Registre uma quantidade de canais maior que ZERO.");
		} else {
			this.qtdCanais = qtdCanais;
		}
	}

	public int getQtdCanais() {
		return qtdCanais;
	}

	public void setQtdCanais(int qtdCanais) {
		this.qtdCanais = qtdCanais;
	}

	public int getVolumeMaximo() {
		return volumeMaximo;
	}

	public void setVolumeMaximo(int volumeMaximo) {
		this.volumeMaximo = volumeMaximo;
	}
	
	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}
	
	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	
}
