package controle;

import bean.Pessoa;
import dao.PessoaDao;

public class PessoaBC {

	public Boolean cadastrar(Pessoa p){
		
		PessoaDao pd = new PessoaDao();
		pd.cadastrar(p);
		
		return true;
		
	}
	
	
}
