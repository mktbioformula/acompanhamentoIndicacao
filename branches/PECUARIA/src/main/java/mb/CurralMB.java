package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Curral;
import controle.esp.CurralBCI;
import controle.impl.CurralBC;

@ManagedBean(name = "CurralMB")
@SessionScoped
public class CurralMB {
	
	private Curral bean;
	private List<Curral> list;
	private CurralBCI controle;

	public Curral getBean() {
		return bean;
	}

	public void setBean(Curral bean) {
		this.bean = bean;
	}

	public List<Curral> getList() {
		return list;
	}

	public void setList(List<Curral> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Curral();
		this.controle = new CurralBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Curral();
		this.list = controle.select();
	}

}
