package br.com.cad.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.cad.bean.Perfil;
import br.com.cad.bean.Pessoa;
import br.com.cad.controle.esp.PerfilBCI;
import br.com.cad.dao.esp.PerfilDaoI;

@Controller
public class PerfilBC implements PerfilBCI{

	@Autowired
	private PerfilDaoI dao;
	
	@Override
	public void insert(Perfil p) {
		dao.save(p);
		
	}

	@Override
	public List<Perfil> select() {
		return dao.findAll();
	}

}
