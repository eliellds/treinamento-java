package br.com.rd.queroserdev.exercicios.sobrecarga.executaveis;

import br.com.rd.queroserdev.exercicios.sobrecarga.modelos.Pessoa;

/* Crie uma classe TestaPessoa que instancie um objeto utilizando o construtor padr�o;
 * Ainda na classe TestaPessoa, inicialize os atributos codigo, nome e idade e acione o 
 * m�todo exibir sem nenhum par�metro. 
 * Repita a opera��o com valores diferentes e execute o m�todo exibir passando um par�metro 
 * (teste com as duas situa��es, valor igual a 1 e diferente de 1);
 * Na classe TestaPessoa, instancie um objeto passando par�metros para o contrutor e 
 * fa�a as chamadas aos dois m�todos exibir com todas as situa��es poss�veis.
 */

public class TestaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setAtributos(1, "Impa", 45);
		System.out.println(pessoa1.exibir());
		System.out.println("=================");
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.setAtributos(2, "Zelda", 23);
		System.out.println(pessoa2.exibir(1));
		System.out.println("=================");
		System.out.println(pessoa2.exibir(0));
		System.out.println("=================");
		
		Pessoa pessoa3 = new Pessoa(3, "Saria", 11);
		
		System.out.println(pessoa3.exibir());
		System.out.println("=================");
		System.out.println(pessoa3.exibir(0));
		System.out.println("=================");
		System.out.println(pessoa3.exibir(1));

	}

}
