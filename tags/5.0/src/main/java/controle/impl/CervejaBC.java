package controle.impl;

import java.util.List;

import bean.Cerveja;
import controle.esp.CervejaBCI;
import dao.esp.CervejaDaoI;
import dao.impl.CervejaDao;

public class CervejaBC implements CervejaBCI {

	private CervejaDaoI dao = new CervejaDao();
	
	public void insert(Cerveja c) {
		dao.insert(c);
	}

	public List<Cerveja> select() {
		return dao.select();
	}

}
