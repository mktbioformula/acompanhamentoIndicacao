package controle.impl;

import java.util.List;

import bean.Lote;
import controle.esp.LoteBCI;

public class LoteBC implements LoteBCI {

	private LoteBCI dao = new LoteBC();
	
	public void insert(Lote cLote) {
		this.dao.insert(cLote);
	}

	public List<Lote> select() {
		
		return this.dao.select();
	}
	
	

}
