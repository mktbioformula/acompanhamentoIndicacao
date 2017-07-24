package dao.esp;

import java.util.List;

import bean.Livro;

public interface LivroDaoI {
	public void insert(Livro l);
	
	public List<Livro> select();
}
