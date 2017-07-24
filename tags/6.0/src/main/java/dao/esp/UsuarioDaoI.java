package dao.esp;

import java.util.List;

import bean.Usuario;

public interface UsuarioDaoI {
	public void insert(Usuario u);
	
	public List<Usuario> select();
}
