package dao.esp;

import java.util.List;
import bean.Pais;

public interface PaisDaoI {
	public void insert(Pais p);
	public List<Pais> select();

}
