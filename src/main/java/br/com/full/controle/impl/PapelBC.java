package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Papel;
import br.com.full.controle.PapelBCI;
import br.com.full.dao.PapelDaoI;

@Controller
public class PapelBC implements PapelBCI {

	@Autowired
	private PapelDaoI dao;

	@Override
	public void cadastrar(Papel p) {
		dao.save(p); // grava no banco
	}

	@Override
	public List<Papel> select() {
		return dao.findAll();
	}

	@Override
	public void update(Papel p) {
		dao.save(p);
	}

	@Override
	public void delete(Papel p) {
		dao.delete(p);
	}



}
