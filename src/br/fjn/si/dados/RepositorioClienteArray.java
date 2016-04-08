package br.fjn.si.dados;

import br.fjn.si.locadora.Cliente;

public class RepositorioClienteArray implements RepositorioCliente {
	private Cliente[] clientes;
	private int pos;

	public RepositorioClienteArray(int tamanho) {
		clientes = new Cliente[tamanho];
		pos = 0;
	}

	public Cliente procurar(String cpf) {
		Cliente resposta = null;
		int i = this.getPos(cpf);
		if (i == this.pos) {
			System.out.println("Cliente nao encontrada");
		} else {
			resposta = this.clientes[i];
		}
		return resposta;

	}

	private int getPos(String cpf) {

		String n;
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.pos)) {
			n = clientes[i].getCpf();
			if (n.equals(cpf)) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		return i;

	}

	public void remover(String cpf) {
		int i = this.getPos(cpf);
		this.pos = this.pos - 1;
		this.clientes[i] = this.clientes[this.pos];
		this.clientes[this.pos] = null;

	}

	public boolean existe(String cpf) {
		int i = this.getPos(cpf);
		return (i != this.pos);
	}

	public void cadastrar(Cliente nome) {
		clientes[pos] = nome;
		pos = pos + 1;

	}

	public void atualizar(Cliente nome) {
		int i = this.getPos(nome.getNome());
		if (i == this.pos) {
			System.out.println("Cliente nao encontrada");
		} else {
			this.clientes[i] = nome;
		}

	}

	private int getPos(Cliente cpf) {

		String n;
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.pos)) {
			n = clientes[i].getCpf();
			if (n.equals(cpf)) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		return i;

	}

	@Override
	public void remover2(Cliente nome) {
		int i = this.getPos(nome);
		this.pos = this.pos - 1;
		this.clientes[i] = this.clientes[this.pos];
		this.clientes[this.pos] = null;

	}

}
