package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import br.com.full.bean.Formato;
import br.com.full.controle.FormatoBCI;
import br.com.full.dao.FormatoDaoI;

@Controller
public class FormatoBC implements FormatoBCI {

	@Autowired
	private FormatoDaoI dao;

	@Transactional
	public void insert(Formato f) {
		dao.save(f);		
	}

	@Transactional
	public List<Formato> select() {
		return dao.findAll();
	}

	@Transactional
	public void update(Formato f) {
		dao.save(f);		
	}

	@Transactional
	public void delete(Formato f) {
		dao.delete(f);		
	}
}
