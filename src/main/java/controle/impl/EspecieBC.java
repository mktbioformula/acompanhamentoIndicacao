package controle.impl;

import java.util.List;

import bean.Especie;
import controle.esp.EspecieBCI;

public class EspecieBC implements EspecieBCI{

	private EspecieBCI dao = new EspecieBC();
	
	public void insert(Especie cEspecie) {
		this.dao.insert(cEspecie);
		
	}

	public List<Especie> select() {
		return this.dao.select();
	}

}
