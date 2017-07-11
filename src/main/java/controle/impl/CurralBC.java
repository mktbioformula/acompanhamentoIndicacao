package controle.impl;

import java.util.List;

import bean.Curral;
import controle.esp.CurralBCI;

public class CurralBC implements CurralBCI {
	
	private CurralBCI dao = new CurralBC();

	public void insert(Curral cCurral) {
		this.dao.insert(cCurral);			
	}

	public List<Curral> select() {
		return this.dao.select();		 
	}

}
