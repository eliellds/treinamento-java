package br.com.rd.queroserdev.exercicios.lista04;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda(10);
		
		agenda.armazenarPessoa("Eliel", 26, 1.82F);
		agenda.armazenarPessoa("Wallace", 23, 1.84F);
		agenda.armazenarPessoa("Nívea", 23, 1.65F);
		agenda.armazenarPessoa("Micael", 28, 1.80F);
		agenda.armazenarPessoa("Adriana", 29, 1.70F);
		agenda.armazenarPessoa("Herick", 28, 1.75F);
		agenda.armazenarPessoa("Doris", 10, 1.42F);
		agenda.armazenarPessoa("John", 6, 1.40F);
		agenda.armazenarPessoa("Peterson", 29, 1.83F);
		agenda.armazenarPessoa("Leo", 26, 1.78F);
		
		agenda.imprimirPessoa(9);
		System.out.println("-----");
		agenda.imprimirPessoa(4);
		System.out.println("-----");
		agenda.removerPessoa("oi");
		System.out.println("-----");
		agenda.armazenarPessoa("Daniele", 40, 1.63F);
		System.out.println("-----");
		agenda.removerPessoa("Adriana");
		agenda.imprimirPessoa(4);
		System.out.println("-----");
		System.out.println(agenda.buscaPessoa("Herick"));
		System.out.println("-----");
		System.out.println(agenda.buscaPessoa("Adriana"));
		
	}

}
