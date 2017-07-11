package controle.impl;

import java.util.List;

import bean.Grupo;
import controle.esp.GrupoBCI;

public class GrupoBC implements GrupoBCI {

	private GrupoBCI dao = new GrupoBC();
	
	public void insert(Grupo cGrupo) {
		this.dao.insert(cGrupo);
		
	}

	public List<Grupo> select() {

		return this.dao.select();
	}

}
