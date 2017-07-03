package controle.esp;

import java.util.List;

import bean.Usuario;

public interface UsuarioBCI {
	public void insert(Usuario u);

	public List<Usuario> select();

}
