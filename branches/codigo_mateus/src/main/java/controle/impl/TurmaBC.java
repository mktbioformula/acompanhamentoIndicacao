package controle.impl;

import java.util.List;

import bean.Aluno;
import bean.Turma;
import controle.esp.AlunoBCI;
import controle.esp.TurmaBCI;
import dao.esp.TurmaDaoI;
import dao.impl.TurmaDao;

public class TurmaBC implements TurmaBCI {

	private TurmaDaoI dao = new TurmaDao();
	
	@Override
	public void insert(Turma turma) {
		this.dao.insert(turma);
		if(turma.getAlunos() != null) {
			AlunoBCI controleAluno = new AlunoBC();
			for (Aluno aluno : turma.getAlunos()) {
				aluno.setTurma(turma);
				if (aluno.getId() == null) {
					controleAluno.insert(aluno);
				} else {
					controleAluno.update(aluno);
				}
			}
		}
	}

	@Override
	public void update(Turma turma) {
		dao.update(turma);
	}

	@Override
	public void delete(Turma turma) {
		dao.delete(turma);
	}

	@Override
	public List<Turma> select() {
		return dao.select();
	}

}
