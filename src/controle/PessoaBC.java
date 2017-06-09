package controle;

import bean.Pessoa;
import dao.PessoaDao;

public class PessoaBC {

	
	public Boolean gravar(Pessoa p){
		
		if(p.getEmail().toLowerCase().contains("@hotmail")){
			// não gravar
		}else{
			PessoaDao pd = new PessoaDao();
			pd.gravar(p);
		}
		
		
		return true;
	}
	
	
	
}
