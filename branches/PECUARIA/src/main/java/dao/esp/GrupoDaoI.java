package dao.esp;

import java.util.List;
import bean.Grupo;

public interface GrupoDaoI {
	
	public void insert(Grupo cGrupo);
	public List<Grupo> select();
	

}
