package controle.esp;

import java.util.List;

import bean.Disciplina;

public interface DisciplinaBCI {

	public void insert(Disciplina disciplina);

	public void update(Disciplina disciplina);

	public void delete(Disciplina disciplina);

	public List<Disciplina> select();
	
}
