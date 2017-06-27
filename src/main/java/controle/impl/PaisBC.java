package controle.impl;

import java.util.List;

import bean.Pais;
import controle.esp.PaisBCI;
import dao.esp.PaisDaoI;
import dao.impl.PaisDao;

public class PaisBC implements PaisBCI{
	private PaisDaoI dao = new PaisDao();
	
	public void insert(Pais p) {
		dao.insert(p);
	}

	public List<Pais> select() {
		return dao.select();
	}

}
