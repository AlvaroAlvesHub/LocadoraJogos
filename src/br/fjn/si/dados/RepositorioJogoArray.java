package br.fjn.si.dados;

import java.util.ArrayList;

import br.fjn.si.locadora.Jogo;

public class RepositorioJogoArray implements IRepositorioJogo {

	ArrayList<Jogo> jogos;

	public RepositorioJogoArray() {
		jogos = new ArrayList<>();

	}

	@Override
	public void inserir(Jogo titulo) {
		jogos.add(titulo);
	}

	@Override
	public Jogo procurar(String jogo) {
		for (Jogo j : jogos) {
			if (j.getTitulo().equals(jogo)) {
				return j;
			}
		}
		return null;

	}

	@Override
	public void remover(String titulo) {
		if (existe(titulo)) {
			jogos.remove(procurar(titulo));
		}
	}

	@Override
	public void atualizar(Jogo titulo) {
		if (existe(titulo.getTitulo())) {
			int i = 0;
			for (Jogo j : jogos) {
				if (j.getTitulo().equals(titulo)) {
					jogos.add(i, titulo);
					break;
				}
				i++;
			}

		}
	}

	@Override
	public boolean existe(String titulo) {
		Jogo j = new Jogo();
		j.setTitulo(titulo);
		return jogos.contains(j);
	}

}
