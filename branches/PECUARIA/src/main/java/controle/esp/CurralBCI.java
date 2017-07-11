package controle.esp;

import java.util.List;

import bean.Curral;

public interface CurralBCI {
	
	public void insert(Curral cCurral);
	public List<Curral> select();
	

}
