package controle;

import bean.Pessoa;
import dao.PessoaDao;
import exceptions.SSPException;

public class PessoaBC {

	

	public String chamarPolicia(Pessoa p) {
		return "A polícia esta a caminho, aguarde";
	}

	public Boolean gravar(Pessoa p) throws SSPException {

		if (p.getNome().contains("lula") || 
				p.getNome().contains("aecio")) {
			throw new SSPException();
		}

		if (p.getEmail().toLowerCase().contains("@hotmail")) {
			return false;
		} else {
			PessoaDao pd = new PessoaDao();
			pd.insert(p);
			return true;
		}

		
	}

}
