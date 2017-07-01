package dao.esp;

import java.util.List;

import bean.Cerveja;

public interface CervejaDaoI {
	public void insert(Cerveja c);
	public List<Cerveja> select();
}
