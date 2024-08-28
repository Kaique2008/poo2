package poo_02;

import Atividades.pessoa;

public class atividade2 {

	public static void main(String[] args) {
		
		pessoa pessoa1 = new pessoa();
		pessoa pessoa2 = new pessoa();
		
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("Califórnia, Usa");
		pessoa1.setProfissao("Ator");
		pessoa1.setRg(62476824);
		pessoa1.setCpf(76737647);
		
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, Usa");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa1.setRg(848493);
		pessoa1.setCpf(374743);
		
		System.out.println("----- OBJETO 1 -----");
		System.out.println(pessoa1.getNome ());
		System.out.println(pessoa1.getIdade ());
		System.out.println(pessoa1.getEndereco ());
		System.out.println(pessoa1.getProfissao ());
		System.out.println(pessoa1.getRg ());
		System.out.println(pessoa1.getCpf ());
		
		
		System.out.println("----- OBJETO 2 -----");
		System.out.println(pessoa2.getNome ());
		System.out.println(pessoa2.getIdade ());
		System.out.println(pessoa2.getEndereco ());
		System.out.println(pessoa2.getProfissao ());
		System.out.println(pessoa1.getRg ());
		System.out.println(pessoa1.getCpf ());
		
		
		
		

	}

}

