package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import bean.Cerveja;
import controle.esp.CervejaBCI;
import controle.impl.CervejaBC;

@ManagedBean(name = "CervejaMB")
public class CervejaMB {
	private CervejaBCI controle;
	private Cerveja bean;
	private List<Cerveja> list;
	
	
	@PostConstruct
	public void init(){
		this.controle = new CervejaBC();
		this.bean = new Cerveja();
		this.list = controle.select();
	}

	
	public List<Cerveja> getList() {
		return list;
	}

	public void setList(List<Cerveja> list) {
		this.list = list;
	}

	public Cerveja getBean() {
		return bean;
	}
	public void setBean(Cerveja bean) {
		this.bean = bean;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.bean = new Cerveja();
		this.list = controle.select();
	}
	
}





