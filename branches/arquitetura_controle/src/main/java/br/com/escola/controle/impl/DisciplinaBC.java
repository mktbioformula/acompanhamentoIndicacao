package br.com.escola.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.escola.bean.Disciplina;
import br.com.escola.controle.esp.DisciplinaBCI;
import br.com.escola.dao.esp.DisciplinaDaoI;

@Controller
public class DisciplinaBC implements DisciplinaBCI {

	@Autowired
	private DisciplinaDaoI dao;
	
	@Override
	public void insert(Disciplina d) {
		dao.save(d);
	}

	@Override
	public List<Disciplina> select() {
		return dao.findByCargaHorariaLessThanAndNomeContaining(100, "E");
	}

}
