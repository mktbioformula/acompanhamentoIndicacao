package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import bean.Pais;
import controle.esp.PaisBCI;
import controle.impl.PaisBC;

@ManagedBean(name = "PaisMB")
@ApplicationScoped
public class PaisMB {
	private PaisBCI controle;
	private Pais bean;
	private List<Pais> list;
	
	@PostConstruct
	public void init() {
		this.controle = new PaisBC();
		this.bean = new Pais();
		this.list = controle.select();
	}

	public List<Pais> getList() {
		return list;
	}

	public void setList(List<Pais> list) {
		this.list = list;
	}

	public Pais getBean() {
		return bean;
	}

	public void setBean(Pais bean) {
		this.bean = bean;
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Pais();
		this.list = controle.select();

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Ok", "Pais inserido com sucesso! "));
	
	}
	

	

}
