package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Livro;

public interface LivroBCI {

	public void insert(Livro livro);

	public void update(Livro livro);

	public void delete(Livro livro);

	public List<Livro> select();
	
}
