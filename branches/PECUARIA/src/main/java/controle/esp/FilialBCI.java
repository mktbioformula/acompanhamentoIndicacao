package controle.esp;

import java.util.List;

import bean.Filial;

public interface FilialBCI {
	
	public void insert(Filial cFilial);
	public List<Filial> select();
	

}
