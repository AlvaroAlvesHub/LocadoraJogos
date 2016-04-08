package br.fjn.si.locadora;

import br.fjn.si.dados.RepositorioCliente;
import br.fjn.si.dados.RepositorioJogo;

public class Locadora {
	private RepositorioJogo jogos;
	private RepositorioCliente clientes;

	public Locadora(RepositorioJogo rep) {
		this.jogos = rep;
	}

	public Locadora(RepositorioCliente rep2) {
		this.clientes = rep2;
	}

	public void cadastraJogo(Jogo jogo) {
		String titulo = jogo.getTitulo();
		String genero = jogo.getGenero();
		String plataforma = jogo.getPlataforma();
		int ano = jogo.getAno();
		String id = jogo.getId();
		if (jogos.existe(titulo)) {
			System.out.println("jogo já cadastrado");
		}
		jogos.inserir(jogo);

	}

	public boolean procurarJogo(String id) {
		if (jogos.existe(id)) {
			return true;
		}
		return false;
	}

	public void removerJogo(String id) {
		jogos.remover(id);
	}

	public void atualizarJogo(Jogo jogo) {
		jogos.remover2(jogo);
		String genero = jogo.getGenero();
		String plataforma = jogo.getPlataforma();
		int ano = jogo.getAno();
		String id = jogo.getId();

		jogos.inserir(jogo);

	}

	public String getGenero(String id) {
		Jogo j = jogos.procurar(id);
		return j.getGenero();
	}

	public String getPlataforma(String id) {
		Jogo j = jogos.procurar(id);
		return j.getPlataforma();
	}

	public String getTitulo(String id) {
		Jogo t = jogos.procurar(id);
		return t.getTitulo();
	}

	public void cadastraCliente(Cliente nome) {
		String Nome = nome.getNome();
		Endereco endereco = nome.getEndereco();
		String telefone = nome.getTelefone();
		String cpf = nome.getCpf();
		int idade = nome.getIdade();
		if (clientes.existe(cpf) == true) {
			System.out.println("Cliente já cadastrado");
		}
		if (dependencia(nome) == true) {
			System.out.println("cliente cadastrado com sucesso");
			clientes.cadastrar(nome);
		}

	}

	public boolean procurarCliente(String cpf) {
		if (clientes.existe(cpf)) {

			return true;
		}
		return false;
	}

	public void removerCliente(String cpf) {
		clientes.remover(cpf);
	}

	public void atualizarCliente(Cliente nome) {

		String Nome = nome.getNome();
		Endereco endereco = nome.getEndereco();
		String telefone = nome.getTelefone();
		String cpf = nome.getCpf();
		int idade = nome.getIdade();
		clientes.cadastrar(nome);
		System.out.println("Cliente atualizado com sucesso.");

	}

	public String getTelefone(String cpf) {
		Cliente t = clientes.procurar(cpf);
		return t.getTelefone();
	}

	public String getNome(String cpf) {
		Cliente n = clientes.procurar(cpf);
		return n.getNome();
	}

	public int getIdade(String cpf) {
		Cliente i = clientes.procurar(cpf);
		return i.getIdade();
	}

	private boolean dependencia(Cliente nome) {
		if (nome.getIdade() < 18) {
			System.out
					.println("Você precisa da autorização dos seus pais para fazer o cadastro");
			return false;
		} else {

			return true;
		}

	}

}
