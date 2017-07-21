package br.com.escola.controle.esp;

import java.util.List;

import br.com.escola.bean.Disciplina;

public interface DisciplinaBCI {

	public void insert(Disciplina d);
	
	public List<Disciplina> select();
	
	
}
