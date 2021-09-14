package br.com.rd.queroserdev.exercicios.lista04.modelos;

/*4. Crie uma classe televis�o e uma classe controle remoto que pode controlar o volume e
trocar os canais da televis�o.
� O controle do volume permite aumentar ou diminuir a pot�ncia do volume de som
em uma unidade de cada vez;
� O controle do canal tamb�m permite aumentar ou diminuir o n�mero do canal em
uma unidade , por�m, tamb�m possibilita a troca para um canal especificado;
� Tamb�m devem existir m�todos para consultar o volume de som e o canal
selecionado.*/

public class ControleRemoto{
	
	private Televisao televisao;

	public ControleRemoto(Televisao televisao) {
		this.televisao = televisao;
	}

	public void subirCanal() {
		if (this.televisao.getCanalAtual() < this.televisao.getQtdCanais()) {
			this.televisao.setCanalAtual(this.televisao.getCanalAtual() + 1);;
		} else {
			this.televisao.setCanalAtual(1);
		}
	}
	
	public Televisao getTelevisao() {
		return televisao;
	}

	public void setTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}

	public void descerCanal() {
		if (this.televisao.getCanalAtual() > 1) {
			this.televisao.setCanalAtual(this.televisao.getCanalAtual() - 1);;
		} else {
			this.televisao.setCanalAtual(this.televisao.getQtdCanais());
		}
	}
	
	public void escolherCanal(int canal) {
		if (canal >= 1 && canal <= this.televisao.getQtdCanais()) {
			this.televisao.setCanalAtual(canal);
		} else {
			System.out.println("Canal n�o sintonizado");
		}
	}
	
	public void aumentarVolume() {
		if (this.televisao.getVolumeAtual() < this.televisao.getVolumeMaximo()) {
			this.televisao.setVolumeAtual(this.televisao.getVolumeAtual() + 1);
		} else {
			System.out.println("Volume m�ximo");
		}
	}
	
	public void diminuirVolume() {
		if (this.televisao.getVolumeAtual() > 0) {
			this.televisao.setVolumeAtual(this.televisao.getVolumeAtual() - 1);
		} else {
			System.out.println("Volume m�nimo");
		}
	}

}
