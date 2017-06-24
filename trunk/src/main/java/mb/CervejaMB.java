package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import bean.Cerveja;
import controle.esp.CervejaBCI;
import controle.impl.CervejaBC;

@ManagedBean(name = "CervejaMB")
@ApplicationScoped
public class CervejaMB {
	private CervejaBCI controle;
	private Cerveja bean;
	private List<Cerveja> list;
	


	@PostConstruct
	public void init() {
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

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Cerveja();
		this.list = controle.select();

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Ok", "Cerveja cadastrada com sucesso! "));
	
	}
	
	public void trocarTexto(){
		System.out.println("executou");
	}
	
	

}








