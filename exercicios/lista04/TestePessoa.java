package br.com.rd.queroserdev.exercicios.lista04;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Eliel Lopes", 26, 1.82F);
		Pessoa pessoa2 = new Pessoa("Wallace Santos", 23, 1.84F);
		
		System.out.println(pessoa1.getNome());
		System.out.println("-----");
		System.out.println(pessoa1.getIdade());
		System.out.println("-----");
		System.out.println(pessoa1.getAltura());
		System.out.println("-----");
		
		pessoa1.setIdade(0);
		System.out.println("-----");
		pessoa2.setAltura(1.83F);
		
		System.out.println(pessoa1.getDados());
		System.out.println("-----");
		System.out.println(pessoa2.getDados());
		
	}

}
