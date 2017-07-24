package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Editora;

public interface EditoraBCI {
	
	public void inserir(Editora e);
	
	public void delete(Editora e);
	
	public void update(Editora e);
		
	public List<Editora> select();
}
