package br.com.full.controle;

import java.util.List;

import br.com.full.bean.ClientePessoaJuridica;

public interface ClientePessoaJuridicaBCI {
	public void cadastrar(ClientePessoaJuridica c);
	public List<ClientePessoaJuridica> select();
	public void update(ClientePessoaJuridica c);
	public void delete(ClientePessoaJuridica c);

}
