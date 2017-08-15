package br.com.cad.controle.esp;

import java.util.List;

import br.com.cad.bean.Perfil;
//http://cursos.ifg.edu.br/ws_spring/select_corpo_docente/609
public interface PerfilBCI {
	public void insert(Perfil p);
	public List<Perfil> select();
}
