package dao.esp;

import java.util.List;

import bean.Emprestimo;

public interface EmprestimoDaoI {
	
	
	public void insert(Emprestimo e);
	
	public List<Emprestimo> select();
}
