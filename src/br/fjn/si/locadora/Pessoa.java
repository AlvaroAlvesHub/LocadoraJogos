package br.fjn.si.locadora;

public abstract class Pessoa {

	protected String nome;
	protected String telefone;
	protected String cpf;
	protected int idade;

	public Pessoa() {
		
	}

	public Pessoa(String nome2, String telefone2, String cpf2, int idade2) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public abstract boolean dependencia(Cliente nome);

}
