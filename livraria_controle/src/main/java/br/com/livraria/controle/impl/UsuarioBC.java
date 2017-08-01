package br.com.livraria.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.livraria.bean.Usuario;
import br.com.livraria.controle.esp.UsuarioBCI;
import br.com.livraria.dao.esp.UsuarioDaoI;

@Controller
public class UsuarioBC implements UsuarioBCI {

	@Autowired
	private UsuarioDaoI dao;

	@Override
	public void insert(Usuario u) {
		dao.save(u);
	}

	@Override
	public void update(Usuario u) {
		dao.save(u);
	}

	@Override
	public void delete(Usuario u) {
		dao.delete(u);
	}

	@Override
	public List<Usuario> select() {
		return dao.findAll();
	}

}
