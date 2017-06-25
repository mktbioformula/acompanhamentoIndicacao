package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Formato;
import br.com.full.bean.OS;

public interface OSBCI {
	public void insert(OS os);
	public List<OS> select();
	public void update(OS os);
	public void delete(OS os);
	
}
