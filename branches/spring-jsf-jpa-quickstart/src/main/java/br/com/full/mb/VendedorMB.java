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
import br.com.full.bean.Vendedor;
import br.com.full.controle.VendedorBCI;

@ManagedBean(name = "VendedorMB")
@Scope("view")
public class VendedorMB extends SpringBeanAutowiringSupport {

	private Vendedor bean;
	@Autowired
	private VendedorBCI controle;
	private List<Vendedor> list;

	@PostConstruct
	public void init() {
		this.list = controle.select();
		this.bean = new Vendedor();
	}

	public Vendedor getBean() {
		return bean;
	}

	public void setBean(Vendedor bean) {
		this.bean = bean;
	}

	public List<Vendedor> getList() {
		return list;
	}

	public void setList(List<Vendedor> list) {
		this.list = list;
	}

	public void cadastraVendedor() {
		this.controle.cadastrar(this.bean);
		this.init();
	}

	public void edit(RowEditEvent event) {
		Vendedor f = (Vendedor) event.getObject();
		this.controle.update(f);
		FacesMessage msg = new FacesMessage("Vendedor ALTERADO com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void delete(Vendedor v) {
		this.controle.delete(v);		
		this.list = controle.select();
		FacesMessage msg = new FacesMessage("Vendedor EXCLUIDO com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);		
	}

	public void cancelarEdicao() {
		FacesMessage msg = new FacesMessage("Edição cancelada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}


}
