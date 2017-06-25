package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Formato;

public interface FormatoBCI {
	public void insert(Formato f);
	public List<Formato> select();
	public void update(Formato f);
	public void delete(Formato f);
	
}
