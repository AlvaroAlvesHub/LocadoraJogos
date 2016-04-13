package br.fjn.si.locadora;

import br.fjn.si.dados.IRepositorioCliente;
import br.fjn.si.dados.IRepositorioJogo;

public class Locadora {
	private IRepositorioJogo jogos;
	private IRepositorioCliente clientes;

	public Locadora(IRepositorioJogo rep) {
		this.jogos = rep;
	}													// falta verificar metodos repetidos e criar repositorio aluguel.

	public Locadora(IRepositorioCliente rep2) {
		this.clientes = rep2;
	}

	public void cadastraJogo(Jogo jogo) {
		if (procurarJogo(jogo.getTitulo())) {
			System.out.println("jogo já cadastrado");
		}
		jogos.inserir(jogo);

	}

	public boolean procurarJogo(String titulo) {
		if( jogos.existe(titulo)){
			return true;
			
		}
			return false ;
	}

	public void atualizarJogo(Jogo jogo) {
		
		jogos.atualizar(jogo);

	}
	public void removeJogo(String titulo){
	
		jogos.remover(titulo);
	}

	public String getGenero(String titulo) {
		Jogo j = jogos.procurar(titulo);
		return j.getGenero();
	}

	public String getPlataforma(String titulo) {
		Jogo j = jogos.procurar(titulo);
		return j.getPlataforma();
	}

	public String getTitulo(String id) {
		Jogo t = jogos.procurar(id);
		return t.getTitulo();
	}

	public void cadastraCliente(Cliente cliente) {
		clientes.cadastrar(cliente);

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

	public void atualizarCliente(Cliente cliente) {
		clientes.atualizar(cliente);

	}

	private boolean dependencia(Cliente cliente) {
		if (cliente.getIdade() < 18) {
			System.out
					.println("Você precisa da autorização dos seus pais para fazer o cadastro");
			return false;
		} else {

			return true;
		}

	}

}
