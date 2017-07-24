package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import bean.Genero;
import controle.esp.GeneroBCI;
import controle.impl.GeneroBC;

@ManagedBean(name = "GeneroMB")
@ViewScoped
public class GeneroMB {
	private GeneroBCI controle;
	private Genero bean;
	private List<Genero> list;
	
	@PostConstruct
	public void init(){
		this.controle = new GeneroBC();
		this.bean = new Genero();
		this.list = controle.select();
	}
	public GeneroBCI getControle() {
		return controle;
	}
	public void setControle(GeneroBCI controle) {
		this.controle = controle;
	}
	public Genero getBean() {
		return bean;
	}
	public void setBean(Genero bean) {
		this.bean = bean;
	}
	public List<Genero> getList() {
		return list;
	}
	public void setList(List<Genero> list) {
		this.list = list;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.bean = new Genero();
		this.list = controle.select();
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Ok", "Genero cadastrada com sucesso! "));
	}
	
	
}
