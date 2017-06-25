package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Vendedor;
import br.com.full.controle.VendedorBCI;
import br.com.full.dao.VendedorDaoI;
@Controller
public class VendedorBC implements VendedorBCI {

	@Autowired
	private VendedorDaoI dao;

	@Override
	public void cadastrar(Vendedor v) {
		dao.save(v); // grava no banco

	}

	@Override
	public List<Vendedor> select() {

		return dao.findAll();

	}

	@Override
	public void update(Vendedor v) {

		dao.save(v);
	}

	@Override
	public void delete(Vendedor v) {
		dao.delete(v);
	}

}
