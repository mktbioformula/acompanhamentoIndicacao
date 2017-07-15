package dao.esp;

import java.util.List;

import bean.Turma;

public interface TurmaDaoI {
	
	public void insert(Turma turma);

	public void update(Turma turma);

	public void delete(Turma turma);

	public List<Turma> select();

}
