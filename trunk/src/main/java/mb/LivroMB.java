package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import bean.Livro;
import controle.esp.LivroBCI;
import controle.impl.LivroBC;

@ManagedBean(name = "LivroMB")
@ViewScoped
public class LivroMB {
	private LivroBCI controle;
	private Livro bean;
	private List<Livro> list;
	
	@PostConstruct
	public void init(){
		this.controle = new LivroBC();
		this.bean = new Livro();
		this.list = controle.select();
	}
	public LivroBCI getControle() {
		return controle;
	}
	public void setControle(LivroBCI controle) {
		this.controle = controle;
	}
	public Livro getBean() {
		return bean;
	}
	public void setBean(Livro bean) {
		this.bean = bean;
	}
	public List<Livro> getList() {
		return list;
	}
	public void setList(List<Livro> list) {
		this.list = list;
	}
	
	public void gravar(){
		this.controle.insert(this.bean);
		this.bean = new Livro();
		this.list = controle.select();
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Ok", "Livro cadastrada com sucesso! "));
	}
	
	
}
