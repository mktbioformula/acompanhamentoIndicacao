package br.com.livraria.controle.esp;

import java.util.List;

import br.com.livraria.bean.Cliente;

public interface ClienteBCI {
	
	public void insert(Cliente c);

	public void update(Cliente c);

	public void delete(Cliente c);

	public List<Cliente> select();
	
}
