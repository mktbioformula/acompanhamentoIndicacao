package controle.impl;

import java.util.List;

import bean.Autor;
import controle.esp.AutorBCI;
import dao.esp.AutorDaoI;
import dao.impl.AutorDao;

public class AutorBC implements AutorBCI {
	private AutorDaoI dao = new AutorDao();

	public void insert(Autor a) {
		this.dao.insert(a);
		
	}

	public List<Autor> select() {
		return this.dao.select();
	}

}
