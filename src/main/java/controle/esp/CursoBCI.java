package controle.esp;

import java.util.List;

import bean.Curso;

public interface CursoBCI {

	public void insert(Curso curso);

	public void update(Curso curso);

	public void delete(Curso curso);

	public List<Curso> select();
	
	public Curso findById(Curso curso);
	
}
