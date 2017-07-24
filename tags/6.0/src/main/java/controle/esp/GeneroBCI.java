package controle.esp;

import java.util.List;

import bean.Genero;

public interface GeneroBCI {
	public void insert(Genero g);

	public List<Genero> select();

}
