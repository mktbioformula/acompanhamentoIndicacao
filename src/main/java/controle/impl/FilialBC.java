package controle.impl;

import java.util.List;

import bean.Filial;
import controle.esp.FilialBCI;

public class FilialBC implements FilialBCI {

	private FilialBCI dao = new FilialBC();
	
	public void insert(Filial cFilial) {
		this.dao.insert(cFilial);
		
	}

	public List<Filial> select() {
		
		return this.dao.select();
	}

}
