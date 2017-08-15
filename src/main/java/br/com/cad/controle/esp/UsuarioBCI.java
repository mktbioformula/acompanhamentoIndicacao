package br.com.cad.controle.esp;

import java.util.List;

import br.com.cad.bean.Usuario;

public interface UsuarioBCI {
	public void insert(Usuario p);
	public List<Usuario> select();
}
