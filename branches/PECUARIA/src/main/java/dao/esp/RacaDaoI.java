package dao.esp;

import java.util.List;
import bean.Raca;

public interface RacaDaoI {
	
	public void insert(Raca cRaca);
	public List<Raca> select();
	

}
