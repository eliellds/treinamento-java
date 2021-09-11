package br.com.rd.queroserdev.exercicios.lista04;

public class TesteTelevisaoControle {

	public static void main(String[] args) {
		
		Televisao tv1 = new Televisao(50);
		ControleRemoto controle1 = new ControleRemoto(tv1);
		
		controle1.diminuirVolume();
		System.out.println(tv1.getVolumeAtual());
		
		do {
			controle1.aumentarVolume();
		} while (tv1.getVolumeAtual() < tv1.getVolumeMaximo());
		
		System.out.println(tv1.getVolumeAtual());
		
		controle1.descerCanal();
		System.out.println(tv1.getCanalAtual());
		
		controle1.subirCanal();
		System.out.println(tv1.getCanalAtual());
		
		controle1.aumentarVolume();
		System.out.println(tv1.getVolumeAtual());
		
		controle1.escolherCanal(97);
		System.out.println(tv1.getCanalAtual());
		
		controle1.escolherCanal(21);
		System.out.println(tv1.getCanalAtual());

	}

}
