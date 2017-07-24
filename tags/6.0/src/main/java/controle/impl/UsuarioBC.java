package controle.impl;

import java.util.List;

import bean.Usuario;
import controle.esp.UsuarioBCI;
import dao.esp.UsuarioDaoI;
import dao.impl.UsuarioDao;

public class UsuarioBC implements UsuarioBCI {

	private UsuarioDaoI dao = new UsuarioDao();

	public void insert(Usuario u) {
		dao.insert(u);
	}

	public List<Usuario> select() {
		return dao.select();
	}

}
