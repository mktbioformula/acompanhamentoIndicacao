package br.com.cad.controle.esp;

import java.util.List;

import br.com.cad.bean.Pessoa;

public interface PessoaBCI {
	public void insert(Pessoa p);
	public List<Pessoa> select();
}
