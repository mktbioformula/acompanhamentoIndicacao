package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Vendedor;

public interface VendedorBCI {
	public void cadastrar(Vendedor v);
	
	public void delete(Vendedor v);

	public void update(Vendedor v);

	public List<Vendedor> select();
}
