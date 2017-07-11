package controle.esp;

import java.util.List;

import bean.Especie;

public interface EspecieBCI {
	
	public void insert(Especie cEspecie);
	public List<Especie> select();
	

}
