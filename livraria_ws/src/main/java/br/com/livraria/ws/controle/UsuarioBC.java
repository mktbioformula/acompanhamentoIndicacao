package br.com.livraria.ws.controle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import br.com.livraria.ws.bean.Usuario;

@Controller
public class UsuarioBC implements UsuarioBCI {
	
	private List<Usuario> list;
	
	public UsuarioBC(){
		 list = new ArrayList<Usuario>();
		 
		 list.add(new Usuario(1, "João", "555-5656"));
		 list.add(new Usuario(2, "Maria", "125-9956"));
		 list.add(new Usuario(3, "José", "566-5826"));
		 list.add(new Usuario(4, "Pedro", "999-2256"));
	}

	public void insert(Usuario u) {
		
		this.list.add(u);
	}

	public List<Usuario> select() {
		return this.list;
	}

}
