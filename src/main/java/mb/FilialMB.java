package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Filial;
import controle.esp.FilialBCI;
import controle.impl.FilialBC;

@ManagedBean(name = "FilialMB")
@SessionScoped
public class FilialMB {
	
	private Filial bean;
	private List<Filial> list;
	private FilialBCI controle;

	public Filial getBean() {
		return bean;
	}

	public void setBean(Filial bean) {
		this.bean = bean;
	}

	public List<Filial> getList() {
		return list;
	}

	public void setList(List<Filial> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Filial();
		this.controle = new FilialBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Filial();
		this.list = controle.select();
	}

}

