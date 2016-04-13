package br.fjn.si.dados;

import br.fjn.si.locadora.Cliente;

public interface IRepositorioPedido {

	void cadastrar(Pedido cliente);

	Cliente procurar(String titulo);

	void remover(String titulo);

	void atualizar(Pedido Pedido);

	boolean existe(String titulo);

}
