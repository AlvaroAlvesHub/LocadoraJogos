package br.fjn.si.locadora;

public class Cliente extends Pessoa {

	private Endereco endereco;

	public Cliente() {
	
	}

	public Cliente(String nome, String telefone, String cpf, int idade,
			Endereco endereco) {
		super(nome, telefone, cpf, idade);
		this.nome = nome;

		this.telefone = telefone;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public boolean dependencia(Cliente nome) {
		if (nome.getIdade() < 18) {
			System.out
					.println("Você precisa da autorização dos seus pais para fazer o cadastro");
			return false;
		} else {
			return true;
		}

	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", cpf="
				+ cpf + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			Cliente c = (Cliente) obj;
			if (c.getCpf().equals(cpf)) {
				return true;
			}

		}
		return false;

	}
}
