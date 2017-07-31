package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Genero;
import br.com.livraria.controle.esp.GeneroBCI;
import br.com.livraria.dao.esp.GeneroDaoI;

@Controller
public class GeneroBC implements GeneroBCI{

	@Autowired
	private GeneroDaoI dao;
	
	
	@Override
	public void insert(Genero g) {
		dao.save(g);
		
	}

	@Override
	public void delete(Genero g) {
		dao.delete(g);
		
	}

	@Override
	public void update(Genero g) {
		dao.save(g);
		
	}

	@Override
	public List<Genero> select() {
		
		return dao.findAll();
	}

	
}
