package dao.esp;

import java.util.List;

import bean.Aluno;

public interface AlunoDaoI {

	public void insert(Aluno aluno);

	public void update(Aluno aluno);

	public void delete(Aluno aluno);

	public List<Aluno> select();
	
	public List<Aluno> selectMatriculados();

}
