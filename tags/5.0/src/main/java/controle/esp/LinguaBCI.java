package controle.esp;

import java.util.List;

import bean.Lingua;

public interface LinguaBCI {
	public void insert(Lingua p);

	public List<Lingua> select();

}
