package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Cliente;
import br.com.livraria.controle.esp.ClienteBCI;
import br.com.livraria.dao.esp.ClienteDaoI;

@Controller
public class ClienteBC implements ClienteBCI {

	@Autowired
	private ClienteDaoI dao;

	@Override
	public void insert(Cliente c) {
		dao.save(c);
	}

	@Override
	public void update(Cliente c) {
		dao.save(c);
	}

	@Override
	public void delete(Cliente c) {
		dao.delete(c);
	}

	@Override
	public List<Cliente> select() {
		return dao.findAll();
	}

}
