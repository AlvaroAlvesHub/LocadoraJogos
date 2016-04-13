package br.fjn.si.dados;

import java.util.ArrayList;

import br.fjn.si.locadora.Cliente;

public class RepositorioClienteArray implements IRepositorioCliente {

	ArrayList<Cliente> clientes;

	public RepositorioClienteArray() {
		clientes = new ArrayList<>();
	}

	@Override
	public void cadastrar(Cliente cliente) {
		if (!existe(cliente.getCpf())) {
			clientes.add(cliente);
		}

	}

	@Override
	public Cliente procurar(String cpf) {
		for (Cliente cliente : clientes) {
			if (cpf.equals(cliente.getCpf())) {
				return cliente;
			}

		}
		return null;
	}

	@Override
	public void remover(String cpf) {
		if (existe(cpf)) {
			clientes.remove(procurar(cpf));
		}
	}

	@Override
	public void atualizar(Cliente cliente) {
		if (existe(cliente.getCpf())) {
			int i = 0;
			for (Cliente c : clientes) {
				if (c.equals(cliente)) {
					clientes.add(i, cliente);
					break;
				}
				i++;
			}

		}
	}

	@Override
	public boolean existe(String cpf) {
		if (procurar(cpf) != null) {
			return true;
		}
		return false;
	}
}
