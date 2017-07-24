package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Autor;
import br.com.livraria.controle.esp.AutorBCI;
import br.com.livraria.dao.esp.AutorDaoI;
	
@Controller
public class AutorBC implements AutorBCI {
	
	@Autowired
	private AutorDaoI dao;
	
	@Override
	public void insert(Autor autor) {
		dao.save(autor);
		
	}

	@Override
	public void update(Autor autor) {
		dao.save(autor);
		
	}

	@Override
	public void delete(Autor autor) {
		dao.delete(autor);
		
	}

	@Override
	public List<Autor> select() {
		
		return dao.findAll();
	}
	
	

}
