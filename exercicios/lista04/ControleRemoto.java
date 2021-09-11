package br.com.rd.queroserdev.exercicios.lista04;

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
			System.out.println("Canal não sintonizado");
		}
	}
	
	public void aumentarVolume() {
		if (this.televisao.getVolumeAtual() < this.televisao.getVolumeMaximo()) {
			this.televisao.setVolumeAtual(this.televisao.getVolumeAtual() + 1);
		} else {
			System.out.println("Volume máximo");
		}
	}
	
	public void diminuirVolume() {
		if (this.televisao.getVolumeAtual() > 0) {
			this.televisao.setVolumeAtual(this.televisao.getVolumeAtual() - 1);
		} else {
			System.out.println("Volume mínimo");
		}
	}

}
