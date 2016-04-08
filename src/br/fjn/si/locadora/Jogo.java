package br.fjn.si.locadora;

public class Jogo {
	private String titulo;
	private String genero;
	private String plataforma;
	private int ano;
	private String id;

	public Jogo(String titulo, String genero, String plataforma, int ano,
			String id) {

		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.ano = ano;
		this.id = id;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
