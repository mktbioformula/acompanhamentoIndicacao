package dao.esp;

import java.util.List;

import bean.Professor;

public interface ProfessorDaoI {
	
	public void insert(Professor professor);

	public void update(Professor professor);

	public void delete(Professor professor);

	public List<Professor> select();
	
}
