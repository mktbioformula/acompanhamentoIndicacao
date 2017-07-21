package br.com.escola.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.escola.bean.Aluno;
import br.com.escola.controle.esp.AlunoBCI;
import br.com.escola.dao.esp.AlunoDaoI;

@Controller
public class AlunoBC implements AlunoBCI {
	
	@Autowired
	private AlunoDaoI dao;
	
	@Override
	public void insert(Aluno aluno) {
		dao.save(aluno);
	}

	@Override
	public void update(Aluno aluno) {
		dao.save(aluno);
	}

	@Override
	public void delete(Aluno aluno) {
		dao.delete(aluno);
	}

	@Override
	public List<Aluno> select() {
		return dao.findAll();
	}

}
