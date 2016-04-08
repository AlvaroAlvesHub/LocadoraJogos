package br.fjn.si.dados;

import br.fjn.si.locadora.Jogo;

public class RepositorioJogoArray implements RepositorioJogo {
	private Jogo[] titulos;
	private int pos;

	public RepositorioJogoArray(int tamaho) {
		titulos = new Jogo[tamaho];
		pos = 0;
	}

	public Jogo procurar(String id) {
		Jogo resposta = null;
		int i = this.getPos(id);
		if (i == this.pos) {
			System.out.println("Jogo não encontrada");
		} else {
			resposta = this.titulos[i];
		}
		return resposta;

	}

	private int getPos(String id) {

		String n;
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.pos)) {
			n = titulos[i].getId();
			if (n.equals(id)) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		return i;

	}

	public void remover(String id) {
		int i = this.getPos(id);
		this.pos = this.pos - 1;
		this.titulos[i] = this.titulos[this.pos];
		this.titulos[this.pos] = null;

	}

	public boolean existe(String id) {
		int i = this.getPos(id);
		return (i != this.pos);
	}

	public void cadastrar(Jogo jogo) {
		titulos[pos] = jogo;
		pos = pos + 1;

	}

	public void atualizar(Jogo jogo) {
		int i = this.getPos(jogo.getTitulo());
		if (i == this.pos) {
			System.out.println("Jogo não encontrada");
		} else {
			this.titulos[i] = jogo;
		}

	}

	public void inserir(Jogo titulo) {
		titulos[pos] = titulo;
		pos = pos + 1;

	}

	private int getPos(Jogo titulo) {

		String n;
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.pos)) {
			n = titulos[i].getTitulo();
			if (n.equals(titulo)) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		return i;

	}

	@Override
	public boolean existe2(Jogo titulo) {
		int i = this.getPos(titulo);
		return (i != this.pos);
	}

	@Override
	public void remover2(Jogo jogo) {
		int i = this.getPos(jogo);
		this.pos = this.pos - 1;
		this.titulos[i] = this.titulos[this.pos];
		this.titulos[this.pos] = null;

	}

}
