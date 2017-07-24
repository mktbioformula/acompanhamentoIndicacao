package controle.impl;

import java.util.List;

import bean.Emprestimo;
import bean.Livro;
import controle.esp.LivroBCI;
import dao.esp.LivroDaoI;
import dao.impl.LivroDao;

public class LivroBC implements LivroBCI {

	private LivroDaoI dao = new LivroDao();

	public void insert(Livro l) {
		dao.insert(l);
	}

	public List<Livro> select() {
		return dao.select();
	}

}
