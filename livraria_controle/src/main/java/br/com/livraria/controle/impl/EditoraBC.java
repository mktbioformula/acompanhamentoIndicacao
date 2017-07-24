package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.livraria.bean.Editora;
import br.com.livraria.controle.esp.EditoraBCI;
import br.com.livraria.dao.esp.EditoraDaoI;

public class EditoraBC implements EditoraBCI{
	
	@Autowired
	private EditoraDaoI dao;

	@Override
	public void inserir(Editora e) {
		dao.save(e);
		
	}

	@Override
	public void delete(Editora e) {
		dao.save(e);
		
	}

	@Override
	public void update(Editora e) {
		dao.save(e);
		
	}

	@Override
	public List<Editora> select() {
		return dao.findAll();
	}
	
	
	
}
