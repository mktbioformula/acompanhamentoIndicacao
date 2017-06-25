package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.ClientePessoaFisica;
import br.com.full.controle.ClientePessoaFisicaBCI;
import br.com.full.dao.ClientePessoaFisicaDaoI;

@Controller
public class ClientePessoaFisicaBC implements ClientePessoaFisicaBCI {

	@Autowired
	private ClientePessoaFisicaDaoI dao;

	public void cadastrar(ClientePessoaFisica clientepf) {
		dao.save(clientepf);
	}

	public List<ClientePessoaFisica> select() {
		
		List<ClientePessoaFisica> clientes = dao.findByNome("Cliente2");
		for (ClientePessoaFisica c : clientes) {
			System.out.println(c.getNome());
		}
		
		return clientes;
	}

	public void update(ClientePessoaFisica clientepf) {
		dao.save(clientepf);
	}

	@Override
	public void delete(ClientePessoaFisica clientepf) {
		dao.delete(clientepf);
	}
}
