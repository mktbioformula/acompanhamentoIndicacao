package br.com.full.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.full.bean.Formato;
import br.com.full.controle.FormatoBCI;

@ManagedBean(name = "FormatoMB")
@Scope("view")
public class FormatoMB extends SpringBeanAutowiringSupport {

	private Formato bean;
	@Autowired
	private FormatoBCI controle;
	private List<Formato> list;

	@PostConstruct
	public void init() {
		this.list = controle.select();
		this.bean = new Formato();
	}

	public Formato getBean() {
		return bean;
	}

	public void setBean(Formato bean) {
		this.bean = bean;
	}

	public FormatoBCI getControle() {
		return controle;
	}

	public void setControle(FormatoBCI controle) {
		this.controle = controle;
	}

	public List<Formato> getList() {
		return list;
	}

	public void setList(List<Formato> list) {
		this.list = list;
	}

	public void edit(RowEditEvent event) {
		Formato f = (Formato) event.getObject();
		this.controle.update(f);
		FacesMessage msg = new FacesMessage("Formato ALTERADO com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void delete(Formato f) {
		this.controle.delete(f);		
		this.list = controle.select();
		FacesMessage msg = new FacesMessage("Formato EXCLUIDO com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);		
	}

	public void cancelarEdicao() {
		FacesMessage msg = new FacesMessage("Edição cancelada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void insert() {
		this.controle.insert(this.bean);
		this.init();
		FacesMessage msg = new FacesMessage("Formato INCLUIDO com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
