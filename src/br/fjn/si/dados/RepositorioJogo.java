package br.fjn.si.dados;

import br.fjn.si.locadora.Jogo;

public interface RepositorioJogo {
	void inserir(Jogo titulo);

	Jogo procurar(String id);

	void remover(String titulo);

	void atualizar(Jogo titulo);

	boolean existe(String id);

	boolean existe2(Jogo titulo);

	void remover2(Jogo jogo);

}
