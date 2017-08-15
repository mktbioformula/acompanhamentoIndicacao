package br.com.guri.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.guri.bean.Instrumentos;
import br.com.guri.controle.esp.InstrumentosBCI;
import br.com.guri.dao.esp.InstrumentosDaoI;

public class InstrumentosBC implements InstrumentosBCI{

	@Autowired
	public InstrumentosDaoI dao;
	@Override
	public void insert(Instrumentos i) {
	dao.save(i);
		
	}

	@Override
	public List<Instrumentos> select() {
		
		return dao.findAll();
	}

}
