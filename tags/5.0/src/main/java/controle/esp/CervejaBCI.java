package controle.esp;

import java.util.List;

import bean.Cerveja;

public interface CervejaBCI {
	public void insert(Cerveja c);
	public List<Cerveja> select();

}
