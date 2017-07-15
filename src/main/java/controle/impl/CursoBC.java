package controle.impl;

import java.util.List;

import bean.Curso;
import bean.Turma;
import controle.esp.CursoBCI;
import controle.esp.TurmaBCI;
import dao.esp.CursoDaoI;
import dao.impl.CursoDao;

public class CursoBC implements CursoBCI {

	private CursoDaoI dao = new CursoDao();
	
	@Override
	public void insert(Curso curso) {
		dao.insert(curso);
		atualizarTurmas(curso);
	}
	
	private void atualizarTurmas(Curso curso) {
		List<Turma> turmas = curso.getTurmas();
		if(turmas != null) {
			TurmaBCI controleTurma = new TurmaBC();
			for(Turma turma : turmas) {
				turma.setCurso(curso);
				if (turma.getId() == null) {
					controleTurma.insert(turma);
				} else {
					controleTurma.update(turma);
				}
			}
		}
	}

	@Override
	public void update(Curso curso) {
		dao.update(curso);
	}

	@Override
	public void delete(Curso curso) {
		dao.delete(curso);
	}

	@Override
	public List<Curso> select() {
		return dao.select();
	}

	@Override
	public Curso findById(Curso curso) {
		return dao.findById(curso);
	}

}
