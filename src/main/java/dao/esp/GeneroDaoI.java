package dao.esp;

import java.util.List;

import bean.Genero;

public interface GeneroDaoI {
	public void insert(Genero g);
	
	public List<Genero> select();
}
