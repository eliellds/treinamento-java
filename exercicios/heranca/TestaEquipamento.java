package br.com.rd.queroserdev.exercicios.heranca;

public class TestaEquipamento {

	public static void main(String[] args) {
		
		Equipamento equipamento1 = new Equipamento("Multilaser", 43.99F);
		Computador computador1 = new Computador("Dell", 3_499.99F, true, "Windows");
		
		System.out.println(equipamento1.exibirDados());
		System.out.println("=======================");
		System.out.println(computador1.exibirDados());

	}

}
