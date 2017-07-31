package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Emprestimo;

public interface EmprestimoBCI {
	
public void inserir(Emprestimo e);
	
	public void delete(Emprestimo e);
	
	public void update(Emprestimo e);
		
	public List<Emprestimo> select();
	
}
