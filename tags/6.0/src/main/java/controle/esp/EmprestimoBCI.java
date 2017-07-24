package controle.esp;

import java.util.List;

import bean.Emprestimo;

public interface EmprestimoBCI {
	public void insert(Emprestimo e);
	public List<Emprestimo> select();
}
