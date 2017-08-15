package br.com.guri.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.guri.bean.Tipo;
import br.com.guri.controle.esp.TipoBCI;
import br.com.guri.dao.esp.TipoDaoI;

public class TipoBC implements TipoBCI{

	
	@Autowired
	public TipoDaoI dao; 
	
	@Override
	public void insert(Tipo t) {
		dao.save(t);
	}

	@Override
	public List<Tipo> select() {
		
		return dao.findAll();
	}

}
