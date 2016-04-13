package br.fjn.si.dados;

import br.fjn.si.locadora.Cliente;

public interface IRepositorioCliente {
	void cadastrar(Cliente cliente);

	Cliente procurar(String cpf);

	void remover(String cpf);

	void atualizar(Cliente cliente);

	boolean existe(String cpf);

}
