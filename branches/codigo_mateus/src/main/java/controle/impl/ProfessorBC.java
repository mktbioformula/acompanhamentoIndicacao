package controle.impl;

import java.util.List;

import bean.Professor;
import controle.esp.ProfessorBCI;
import dao.esp.ProfessorDaoI;
import dao.impl.ProfessorDao;

public class ProfessorBC implements ProfessorBCI {

	private ProfessorDaoI dao = new ProfessorDao();
	
	@Override
	public void insert(Professor professor) {
		dao.insert(professor);
	}

	@Override
	public void update(Professor professor) {
		dao.update(professor);
	}

	@Override
	public void delete(Professor professor) {
		dao.delete(professor);
	}

	@Override
	public List<Professor> select() {
		return dao.select();
	}

}
