package br.com.relatorio.controle.impl;

import java.util.List;

import br.com.relatorio.bean.Pessoa;
import br.com.relatorio.controle.esp.PessoaBCI;
import br.com.relatorio.dao.esp.PessoaDaoI;
import br.com.relatorio.dao.impl.PessoaDao;

public class PessoaBC implements PessoaBCI {

	private PessoaDaoI dao = new PessoaDao();
	
	public void insert(Pessoa pessoa) {
		dao.insert(pessoa);
	}

	public List<Pessoa> select() {
		return dao.select();
	}

}
