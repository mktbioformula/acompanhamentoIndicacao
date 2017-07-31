package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Emprestimo;
import br.com.livraria.controle.esp.EmprestimoBCI;
import br.com.livraria.dao.esp.EmprestimoDaoI;

@Controller
public class EmprestimoBC implements EmprestimoBCI{

	@Autowired
	private EmprestimoDaoI dao;
	
	@Override
	public void inserir(Emprestimo e) {
		dao.save(e);
		
	}

	@Override
	public void delete(Emprestimo e) {
		dao.delete(e);
		
	}

	@Override
	public void update(Emprestimo e) {
		dao.save(e);
		
	}

	@Override
	public List<Emprestimo> select() {
		return dao.findAll();
	}

}
