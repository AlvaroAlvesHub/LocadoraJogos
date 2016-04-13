package br.fjn.si.locadora;

public class Jogo { // classe feita para o JavaBean
	private String titulo;
	private String genero;
	private String plataforma;
	private int ano;

	public Jogo() {

	}

	public Jogo(String titulo, String genero, String plataforma, int ano) {

		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.ano = ano;

	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getPlataforma() {
		return this.plataforma;
	}

	public int getAno() {
		return this.ano;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Jogo [titulo=" + titulo + ", plataforma=" + plataforma + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Jogo) {
			Jogo j = (Jogo) obj;
			if (j.getTitulo().equals(titulo)) {
				return true;
			}
		}
		return false;
	}

}
