package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Genero;

public interface GeneroBCI {
	
	public void insert(Genero g);
	public void delete(Genero g);
	public void update(Genero g);
	public List<Genero>select();
	

}
