package controle.esp;

import java.util.List;

import bean.Lote;

public interface LoteBCI {
	
	public void insert(Lote cLote);
	public List<Lote> select();
	
}
