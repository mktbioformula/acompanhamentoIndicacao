package controle.esp;

import java.util.List;

import bean.Livro;

public interface LivroBCI {
	public void insert(Livro l);

	public List<Livro> select();

}
