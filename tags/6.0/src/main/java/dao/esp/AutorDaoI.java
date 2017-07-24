package dao.esp;

import java.util.List;

import bean.Autor;

public interface AutorDaoI {

	public void insert(Autor a);

	public List<Autor> select();
}
