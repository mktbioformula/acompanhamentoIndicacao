package controle.impl;

import java.util.List;

import bean.Disciplina;
import bean.Professor;
import controle.esp.DisciplinaBCI;
import controle.esp.ProfessorBCI;
import dao.esp.DisciplinaDaoI;
import dao.impl.DisciplinaDao;

public class DisciplinaBC implements DisciplinaBCI {

	private DisciplinaDaoI dao = new DisciplinaDao();

	@Override
	public void insert(Disciplina disciplina) {
		dao.insert(disciplina);
		atualizarProfessor(disciplina);
	}
	
	private void atualizarProfessor(Disciplina disciplina) {
		Professor professor = disciplina.getProfessor();
		if (professor != null) {
			ProfessorBCI controleProfessor = new ProfessorBC();
			professor.setDisciplina(disciplina);
			if (professor.getId() == null) {
				controleProfessor.insert(professor);
			} else {
				controleProfessor.update(professor);
			}
		}
	}
	@Override
	public void update(Disciplina disciplina) {
		dao.update(disciplina);
	}

	@Override
	public void delete(Disciplina disciplina) {
		dao.delete(disciplina);
	}

	@Override
	public List<Disciplina> select() {
		return dao.select();
	}

}
