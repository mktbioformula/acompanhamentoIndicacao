package controle.esp;

import java.util.List;

import bean.Autor;

public interface AutorBCI {

	public void insert(Autor l);

	public List<Autor> select();

}
