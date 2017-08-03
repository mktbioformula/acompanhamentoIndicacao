package br.com.relatorio.dao.esp;

import java.util.List;

import br.com.relatorio.bean.Pessoa;

public interface PessoaDaoI {
	public void insert(Pessoa pessoa);
	public List<Pessoa> select();
}
