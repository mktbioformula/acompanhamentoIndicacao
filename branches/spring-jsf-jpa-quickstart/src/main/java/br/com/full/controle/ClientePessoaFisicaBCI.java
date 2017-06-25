package br.com.full.controle;

import java.util.List;

import br.com.full.bean.ClientePessoaFisica;

public interface ClientePessoaFisicaBCI {
	public void cadastrar(ClientePessoaFisica clientepf);

	public void delete(ClientePessoaFisica clientepf);

	public List<ClientePessoaFisica> select();

	public void update(ClientePessoaFisica clientepf);
}
