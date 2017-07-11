package controle.impl;

import java.util.List;

import bean.Raca;
import controle.esp.RacaBCI;

public class RacaBC implements RacaBCI{

	private RacaBCI dao = new RacaBC();
	
	public void insert(Raca cRaca) {
		this.dao.insert(cRaca);
		
	}

	public List<Raca> select() {
		
		return this.dao.select();
	}
	

}
