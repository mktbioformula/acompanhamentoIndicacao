package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Papel;

public interface PapelBCI {
	public void cadastrar(Papel p);
	public List<Papel> select();
	public void update(Papel p);
	public void delete(Papel p);
	
}
