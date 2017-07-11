package dao.esp;

import java.util.List;
import bean.Especie;

public interface EspecieDaoI {
	
	public void insert(Especie cEspecie);
	public List<Especie> select();

}
