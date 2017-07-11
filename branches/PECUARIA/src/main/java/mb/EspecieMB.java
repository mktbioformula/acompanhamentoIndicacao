package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Especie;
import controle.esp.EspecieBCI;
import controle.impl.EspecieBC;

@ManagedBean(name = "EspecieMB")
@SessionScoped
public class EspecieMB {
	
	private Especie bean;
	private List<Especie> list;
	private EspecieBCI controle;

	public Especie getBean() {
		return bean;
	}

	public void setBean(Especie bean) {
		this.bean = bean;
	}

	public List<Especie> getList() {
		return list;
	}

	public void setList(List<Especie> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Especie();
		this.controle = new EspecieBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Especie();
		this.list = controle.select();
	}

}
