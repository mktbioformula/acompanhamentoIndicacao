package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Autor;

public interface AutorBCI {
	public void insert(Autor autor);
	public void update(Autor autor);
	public void delete(Autor autor);
	public List<Autor> select();
	
	
}
