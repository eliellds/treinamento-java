package br.com.rd.queroserdev.exercicios.lista04.executaveis;

import br.com.rd.queroserdev.exercicios.lista04.modelos.ControleRemoto;
import br.com.rd.queroserdev.exercicios.lista04.modelos.Televisao;

public class TesteTelevisaoControle {

	public static void main(String[] args) {
		
		Televisao tv1 = new Televisao(50);
		ControleRemoto controle1 = new ControleRemoto(tv1);
		
		controle1.diminuirVolume();
		System.out.println(controle1.getTelevisao().getVolumeAtual());
		
		do {
			controle1.aumentarVolume();
		} while (controle1.getTelevisao().getVolumeAtual() < tv1.getVolumeMaximo());
		
		System.out.println(controle1.getTelevisao().getVolumeAtual());
		
		controle1.descerCanal();
		System.out.println(controle1.getTelevisao().getCanalAtual());
		
		controle1.subirCanal();
		System.out.println(controle1.getTelevisao().getCanalAtual());
		
		controle1.aumentarVolume();
		System.out.println(controle1.getTelevisao().getVolumeAtual());
		
		controle1.escolherCanal(97);
		System.out.println(controle1.getTelevisao().getCanalAtual());
		
		controle1.escolherCanal(21);
		System.out.println(controle1.getTelevisao().getCanalAtual());

	}

}
