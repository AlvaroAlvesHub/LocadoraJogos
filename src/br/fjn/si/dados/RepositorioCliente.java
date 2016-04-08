package br.fjn.si.dados;

import br.fjn.si.locadora.Cliente;
import br.fjn.si.locadora.Endereco;

;

public interface RepositorioCliente {
	void cadastrar(Cliente nome);

	Cliente procurar(String cpf);

	void remover(String cpf);

	void remover2(Cliente nome);

	void atualizar(Cliente nome);

	boolean existe(String cpf);

}
