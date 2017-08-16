package br.com.cad.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;

import br.com.cad.bean.Usuario;
import br.com.cad.controle.esp.UsuarioBCI;
import br.com.cad.dao.esp.UsuarioDaoI;

@Controller
public class UsuarioBC implements UsuarioBCI {

	@Autowired
	private UsuarioDaoI dao;
	private final PasswordEncoder chave = new BCryptPasswordEncoder();

	
	@Override
	public void insert(Usuario p) {
		p.setSenha(chave.encode(p.getSenha()));
		dao.save(p);
		
	}

	@Override
	public List<Usuario> select() {
		return dao.findAll();
	}

}
