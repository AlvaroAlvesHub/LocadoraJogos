package br.fjn.si.dados;

import br.fjn.si.locadora.Jogo;

public interface IRepositorioJogo {

	void inserir(Jogo titulo);

	Jogo procurar(String jogo);

	void remover(String titulo);

	void atualizar(Jogo titulo);

	boolean existe(String titulo);
}
