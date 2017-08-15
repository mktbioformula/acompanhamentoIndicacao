package br.com.cad.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.cad.bean.Pessoa;
import br.com.cad.controle.esp.PessoaBCI;
import br.com.cad.dao.esp.PessoaDaoI;

@Controller
public class PessoaBC implements PessoaBCI {

	@Autowired
	private PessoaDaoI dao;
	
	@Override
	public void insert(Pessoa p) {
		dao.save(p);
		
	}

	@Override
	public List<Pessoa> select() {
		return dao.findAll();
	}

}
