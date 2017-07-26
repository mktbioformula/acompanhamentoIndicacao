package br.com.livraria.ws.controle;

import java.util.List;

import br.com.livraria.ws.bean.Usuario;

public interface UsuarioBCI {

	public void insert(Usuario u);

	public List<Usuario> select();

}
