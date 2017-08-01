package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Usuario;

public interface UsuarioBCI {
	public void insert(Usuario u);

	public void update(Usuario u);

	public void delete(Usuario u);

	public List<Usuario> select();
}
