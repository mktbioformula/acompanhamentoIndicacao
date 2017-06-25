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

import br.com.full.bean.Papel;
import br.com.full.controle.PapelBCI;

@ManagedBean(name = "PapelMB")
@Scope("view")
public class PapelMB extends SpringBeanAutowiringSupport {

	private Papel bean;
	@Autowired
	private PapelBCI controle;
	private List<Papel> list;

	@PostConstruct
	public void init() {
		this.list = controle.select();
		this.bean = new Papel();
	}

	public Papel getBean() {
		return bean;
	}

	public void setBean(Papel bean) {
		this.bean = bean;
	}

	public List<Papel> getList() {
		return list;
	}

	public void setList(List<Papel> list) {
		this.list = list;
	}

	public void edit(RowEditEvent event) {
		Papel p = (Papel) event.getObject();
		this.controle.update(p);
		FacesMessage msg = new FacesMessage("Papel alterado com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}

	public void delete(Papel p ) {
		this.controle.delete(p);
		this.list = controle.select();
		FacesMessage msg = new FacesMessage("Papel excluido com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}

	public void cancelarEdicao() {

		System.out.println("cancelar edição");
	}

	public void cadastrar() {
		this.controle.cadastrar(this.bean);
		this.init();
	}

}
