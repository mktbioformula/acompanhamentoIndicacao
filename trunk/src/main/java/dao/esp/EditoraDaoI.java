package dao.esp;

import java.util.List;

import bean.Editora;

public interface EditoraDaoI {
	
	public void inserir(Editora ed);
	
	public List<Editora> select();
	

}
