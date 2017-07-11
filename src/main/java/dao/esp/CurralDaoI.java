package dao.esp;

import java.util.List;
import bean.Curral;

public interface CurralDaoI {
	
	public void insert(Curral cCurral);
	public List<Curral> select();
	

}
