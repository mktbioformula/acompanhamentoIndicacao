package br.com.relatorio.controle.esp;

import java.util.List;

import br.com.relatorio.bean.Pessoa;

public interface PessoaBCI {

	public void insert(Pessoa pessoa);

	public List<Pessoa> select();
}
