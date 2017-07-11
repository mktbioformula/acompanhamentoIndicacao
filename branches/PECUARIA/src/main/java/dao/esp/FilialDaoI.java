package dao.esp;

import java.util.List;
import bean.Filial;

public interface FilialDaoI {

	public void insert(Filial cFilial);
	public List<Filial> select();
	
}
