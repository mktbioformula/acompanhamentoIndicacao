package controle;

import org.dom4j.DocumentException;

import bean.Pessoa;
import dao.PessoaDao;
import exceptions.SSPException;

public class PessoaBC {

	

	public String chamarPolicia(Pessoa p) {
		return "A polícia esta a caminho, aguarde";
	}

	public Boolean gravar(Pessoa p) throws SSPException, DocumentException {

		
		/*
		 * se o nome for igual a joão e o CPF for igual a
		 * 11111111111 os documentos são falsos
		 * deve ser lançada uma exception do tipo
		 * DocumentoFalsoException
		 * 
		 * */
		if(p.getNome().equals("joao")  && p.getCpf().equals("11111111111") ){
			throw new DocumentException();
		}
		
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
