package br.com.cad.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.cad.bean.Usuario;
import br.com.cad.controle.esp.UsuarioBCI;
import br.com.cad.dao.esp.UsuarioDaoI;

@Controller
public class UsuarioBC implements UsuarioBCI {

	@Autowired
	private UsuarioDaoI dao;
	
	@Override
	public void insert(Usuario p) {
		dao.save(p);
		
	}

	@Override
	public List<Usuario> select() {
		return dao.findAll();
	}

}
