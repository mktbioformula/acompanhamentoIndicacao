package br.com.escola.controle.esp;

import java.util.List;

import br.com.escola.bean.Aluno;

public interface AlunoBCI {

	public void insert(Aluno aluno);

	public void update(Aluno aluno);

	public void delete(Aluno aluno);

	public List<Aluno> select();
	
}
