package br.com.rd.queroserdev.exercicios.sobrecarga.executaveis;

import br.com.rd.queroserdev.exercicios.sobrecarga.modelos.Pessoa;

/* Crie uma classe TestaPessoa que instancie um objeto utilizando o construtor padrão;
 * Ainda na classe TestaPessoa, inicialize os atributos codigo, nome e idade e acione o 
 * método exibir sem nenhum parâmetro. 
 * Repita a operação com valores diferentes e execute o método exibir passando um parâmetro 
 * (teste com as duas situações, valor igual a 1 e diferente de 1);
 * Na classe TestaPessoa, instancie um objeto passando parâmetros para o contrutor e 
 * faça as chamadas aos dois métodos exibir com todas as situações possíveis.
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
