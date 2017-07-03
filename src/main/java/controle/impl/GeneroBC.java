package controle.impl;

import java.util.List;

import bean.Genero;
import controle.esp.GeneroBCI;
import dao.esp.GeneroDaoI;
import dao.impl.GeneroDao;

public class GeneroBC implements GeneroBCI{

	private GeneroDaoI dao = new GeneroDao();
	public void insert(Genero g) {
		// TODO Auto-generated method stub
		
	}

	public List<Genero> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}

	
	

}
