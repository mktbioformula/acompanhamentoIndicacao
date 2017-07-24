package controle.impl;

import java.util.List;

import bean.Emprestimo;
import controle.esp.EmprestimoBCI;
import dao.esp.EmprestimoDaoI;
import dao.impl.EmprestimoDao;

public class EmprestimoBC implements EmprestimoBCI {

	private EmprestimoDaoI dao = new EmprestimoDao();
	
	public void insert(Emprestimo e) {
		dao.insert(e);
		
	}

	public List<Emprestimo> select() {
		return dao.select();
	}

}
