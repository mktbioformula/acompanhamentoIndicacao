package controle.impl;

import java.util.List;

import bean.Lingua;
import controle.esp.LinguaBCI;
import dao.esp.LinguaDaoI;
import dao.impl.LinguaDao;

public class LinguaBC implements LinguaBCI {

	private LinguaDaoI dao = new LinguaDao();

	public void insert(Lingua p) {
		dao.insert(p);
	}

	public List<Lingua> select() {
		return dao.select();
	}

}
