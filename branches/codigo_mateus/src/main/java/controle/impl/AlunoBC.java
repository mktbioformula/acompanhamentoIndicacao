package controle.impl;

import java.util.List;

import bean.Aluno;
import controle.esp.AlunoBCI;
import dao.esp.AlunoDaoI;
import dao.impl.AlunoDao;

public class AlunoBC implements AlunoBCI {
	
	private AlunoDaoI dao = new AlunoDao();
	
	@Override
	public void insert(Aluno aluno) {
		dao.insert(aluno);
	}

	@Override
	public void update(Aluno aluno) {
		dao.update(aluno);
	}

	@Override
	public void delete(Aluno aluno) {
		dao.delete(aluno);
	}

	@Override
	public List<Aluno> select() {
		return dao.select();
	}

}
