package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Raca;
import controle.esp.RacaBCI;
import controle.impl.RacaBC;

@ManagedBean(name = "RacaMB")
@SessionScoped
public class RacaMB {
	
	private Raca bean;
	private List<Raca> list;
	private RacaBCI controle;

	public Raca getBean() {
		return bean;
	}

	public void setBean(Raca bean) {
		this.bean = bean;
	}

	public List<Raca> getList() {
		return list;
	}

	public void setList(List<Raca> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Raca();
		this.controle = new RacaBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Raca();
		this.list = controle.select();
	}

}
