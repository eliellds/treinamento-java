package br.com.rd.queroserdev.exercicios.lista04.modelos;

/*4. Crie uma classe televis�o e uma classe controle remoto que pode controlar o volume e
trocar os canais da televis�o.
� O controle do volume permite aumentar ou diminuir a pot�ncia do volume de som
em uma unidade de cada vez;
� O controle do canal tamb�m permite aumentar ou diminuir o n�mero do canal em
uma unidade , por�m, tamb�m possibilita a troca para um canal especificado;
� Tamb�m devem existir m�todos para consultar o volume de som e o canal
selecionado.*/

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
