package br.com.rd.queroserdev.exercicios.heranca.executaveis;

import br.com.rd.queroserdev.exercicios.heranca.modelos.Computador;
import br.com.rd.queroserdev.exercicios.heranca.modelos.Equipamento;

/*Crie uma classe TestaEquipamento, que deverá conter o método main. 
 * Crie nesta classe um objeto da classe equipamento e preencha os dois atributos que foram 
 * declarados na classe. 
 * Crie uma objeto da classe computador e preencha os atributos dessa classe e da classe herdada.
 */

public class TestaEquipamento {

	public static void main(String[] args) {
		
		Equipamento equipamento1 = new Equipamento("Multilaser", 43.99F);
		Computador computador1 = new Computador("Dell", 3_499.99F, true, "Windows");
		
		System.out.println(equipamento1.exibirDados());
		System.out.println("=======================");
		System.out.println(computador1.exibirDados());

	}

}
