package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.ClientePessoaJuridica;
import br.com.full.controle.ClientePessoaJuridicaBCI;
import br.com.full.dao.ClientePessoaJuridicaDaoI;

@Controller
public class ClientePessoaJuridicaBC implements ClientePessoaJuridicaBCI {

	@Autowired
	private ClientePessoaJuridicaDaoI dao;
	
	@Override
	public void cadastrar(ClientePessoaJuridica c) {
		dao.save(c);
	}

	@Override
	public List<ClientePessoaJuridica> select() {
		return dao.findAll();
	}

	@Override
	public void update(ClientePessoaJuridica c) {
		dao.save(c);
	}

	@Override
	public void delete(ClientePessoaJuridica c) {
		dao.delete(c);
	}

	
}
