package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Autor;
import controle.esp.AutorBCI;
import controle.impl.AutorBC;

@ManagedBean(name = "AutorMB")
@SessionScoped
public class AutorMB {

	private Autor bean;
	private List<Autor> list;
	private AutorBCI controle;

	public Autor getBean() {
		return bean;
	}

	public void setBean(Autor bean) {
		this.bean = bean;
	}

	public List<Autor> getList() {
		return list;
	}

	public void setList(List<Autor> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Autor();
		this.controle = new AutorBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Autor();
		this.list = controle.select();
	}

}
