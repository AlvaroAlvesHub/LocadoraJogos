package br.fjn.si.gui;

import br.fjn.si.dados.*;
import br.fjn.si.locadora.*;

public class teste {

	public static void main(String[] args) {
		RepositorioJogo rep = new RepositorioJogoArray(100);
		Locadora jogo = new Locadora(rep);

		RepositorioCliente rep2 = new RepositorioClienteArray(100);
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
				2015, "001"));

		jogo.cadastraJogo(new Jogo("fifa 16", "Esportes", "PS4&XBOXONE", 2015,
				"002"));

		jogo.cadastraJogo(new Jogo("fifa 17", "Esportes", "PS4&XBOXONE", 2016,
				"003"));

		jogo.cadastraJogo(new Jogo("gta v", "açao e aventura", "PS4&XBOXONE",
				2015, "004"));

		cliente.cadastraCliente(new Cliente("Gabriel", e, "(81)95555-8888",
				"150", 19));
		cliente.cadastraCliente(new Cliente("Daniel", d, "89654-4454", "196",
				19));

		System.out.println(jogo.procurarJogo("004"));
		System.out.println(cliente.procurarCliente("196"));
		System.out.println(jogo.procurarJogo("006"));

	}
}
