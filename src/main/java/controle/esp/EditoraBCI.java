package controle.esp;

import java.util.List;

import bean.Editora;

public interface EditoraBCI {
	
	public void inserir(Editora e);
	
	public List<Editora> select();
	
	
}
