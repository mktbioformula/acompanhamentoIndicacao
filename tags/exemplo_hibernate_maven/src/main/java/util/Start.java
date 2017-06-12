package util;

import bean.Carro;
import bean.Pessoa;
import dao.PessoaDao;

public class Start {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("maria");
		p.setEmail("joao@gmail.com");
		p.setCpf("111111111-11");
		Carro c = new Carro();
		c.setNome("Mustang");
		p.setCarro(c);
		
		PessoaDao pd = new PessoaDao();
		pd.gravar(p);
	}
}
