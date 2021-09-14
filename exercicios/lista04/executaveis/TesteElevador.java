package br.com.rd.queroserdev.exercicios.lista04.executaveis;

import br.com.rd.queroserdev.exercicios.lista04.modelos.Elevador;

public class TesteElevador {

	public static void main(String[] args) {

		Elevador elevador = new Elevador(20, 10);
		
		elevador.sair();
		
		for (int i = 1; i <= elevador.getCapacidade(); i++) {
			elevador.entrar();
		}
		
		elevador.entrar();
		elevador.descer();
		elevador.subir();
		elevador.sair();
		
		System.out.println(elevador.getQtdPessoas());
		System.out.println(elevador.getCapacidade());
		System.out.println(elevador.getAndarAtual());
		System.out.println(elevador.getTotalAndares());
		
	}

}
