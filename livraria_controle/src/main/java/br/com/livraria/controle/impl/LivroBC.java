package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Livro;
import br.com.livraria.controle.esp.LivroBCI;
import br.com.livraria.dao.esp.LivroDaoI;

@Controller
public class LivroBC implements LivroBCI {

	@Autowired
	private LivroDaoI dao;
	
	@Override
	public void insert(Livro livro) {
		dao.save(livro);
	}

	@Override
	public void update(Livro livro) {
		dao.save(livro);
	}

	@Override
	public void delete(Livro livro) {
		dao.delete(livro);
	}

	@Override
	public List<Livro> select() {
		return dao.findAll();
	}

}
