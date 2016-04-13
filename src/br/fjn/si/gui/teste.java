package br.fjn.si.gui;

import br.fjn.si.dados.*;
import br.fjn.si.locadora.*;

public class teste {

	public static void main(String[] args) {
		IRepositorioJogo rep = new RepositorioJogoArray();
		Locadora jogo = new Locadora(rep);

		IRepositorioCliente rep2 = new RepositorioClienteArray();
		Locadora cliente = new Locadora(rep2);

		Endereco e = new Endereco();
		e.setRua("rua principal");
		e.setNumero("25");
		e.setCep("5343");
		Endereco d = new Endereco();
		d.setRua("rua segunda");
		d.setNumero("258");
		d.setCep("53438");

		jogo.cadastraJogo(new Jogo("hallo 5", "Tiro e açao", "XBOXONE e pc",
				2015));

		jogo.cadastraJogo(new Jogo("fifa 16", "Esportes", "PS4&XBOXONE", 2015));

		jogo.cadastraJogo(new Jogo("fifa 17", "Esportes", "PS4&XBOXONE", 2016));

		jogo.cadastraJogo(new Jogo("gta v", "açao e aventura", "PS4&XBOXONE", 2014));

		cliente.cadastraCliente(new Cliente("Alvaro", "9999999", "1234", 38, new Endereco("rkjdljljgf", "2", "53204030")));
		
		//System.out.println(jogo.procurarJogo("fifa 16"));
		//System.out.println(jogo.getPlataforma("fifa 16"));
		//System.out.println(cliente.procurarCliente("1234"));
		//System.out.println(jogo.procurarJogo("hallo 5"));
		
		
		//cliente.removerCliente("1234");
		//jogo.removeJogo("fifa 16");
		//cliente.atualizarCliente(cliente);
		
		System.out.println("===========depois da atualizacao==========");
		
		System.out.println(jogo.procurarJogo("fifa 16"));
		
		System.out.println(cliente.procurarCliente("1234"));
		

	}
}
