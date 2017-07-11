package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Grupo;
import controle.esp.GrupoBCI;
import controle.impl.GrupoBC;

@ManagedBean(name = "GrupoMB")
@SessionScoped
public class GrupoMB {
	
	private Grupo bean;
	private List<Grupo> list;
	private GrupoBCI controle;

	public Grupo getBean() {
		return bean;
	}

	public void setBean(Grupo bean) {
		this.bean = bean;
	}

	public List<Grupo> getList() {
		return list;
	}

	public void setList(List<Grupo> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Grupo();
		this.controle = new GrupoBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Grupo();
		this.list = controle.select();
	}

}
