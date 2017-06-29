package dao.esp;

import java.util.List;

import bean.Lingua;

public interface LinguaDaoI {
	public void insert(Lingua p);

	public List<Lingua> select();

}
