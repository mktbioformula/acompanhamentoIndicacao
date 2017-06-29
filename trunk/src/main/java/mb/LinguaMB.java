package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import bean.Lingua;
import controle.esp.LinguaBCI;
import controle.impl.LinguaBC;

@ManagedBean(name  = "LinguaMB")
public class LinguaMB {

	private LinguaBCI controle;
	private List<Lingua> list;
	private Lingua bean;
	
	@PostConstruct
	private void init(){
		this.controle = new LinguaBC();
		this.list = controle.select();
		this.bean = new Lingua();
	}


	public List<Lingua> getList() {
		return list;
	}

	public void setList(List<Lingua> list) {
		this.list = list;
	}

	public Lingua getBean() {
		return bean;
	}

	public void setBean(Lingua bean) {
		this.bean = bean;
	}
	
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.bean = new Lingua();
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Ok", "Cadastrado com sucesso"));
		this.list = controle.select();
	}
	
	
	
}











