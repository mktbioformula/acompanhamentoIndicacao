package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import bean.Lingua;
import bean.Pais;
import controle.esp.PaisBCI;
import controle.impl.PaisBC;

@ManagedBean(name = "PaisMB")
@ApplicationScoped
public class PaisMB {
	private PaisBCI controle;
	private Pais bean;
	private List<Pais> list;
	private Lingua lingua;
	
	
	@PostConstruct
	public void init() {
		this.controle = new PaisBC();
		this.bean = new Pais();
		this.bean.setStatus(true);
		this.list = controle.select();
		this.lingua = new Lingua();
		this.lingua.setNome("Selecione uma Lingua");
	}

	
	public PaisBCI getControle() {
		return controle;
	}


	public void setControle(PaisBCI controle) {
		this.controle = controle;
	}


	public Lingua getLingua() {
		return lingua;
	}


	public void setLingua(Lingua lingua) {
		this.lingua = lingua;
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
