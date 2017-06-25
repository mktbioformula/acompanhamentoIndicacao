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

import br.com.full.bean.ClientePessoaFisica;
import br.com.full.bean.Formato;
import br.com.full.controle.ClientePessoaFisicaBCI;

@ManagedBean(name = "ClientePessoaFisicaMB")
@Scope("view")
public class ClientePessoaFisicaMB extends SpringBeanAutowiringSupport {

	private ClientePessoaFisica bean;
	@Autowired
	private ClientePessoaFisicaBCI controle;
	private List<ClientePessoaFisica> list;

	@PostConstruct
	public void init() {
		this.list = controle.select();
		this.bean = new ClientePessoaFisica();
	}

	public ClientePessoaFisica getBean() {
		return bean;
	}

	public void setBean(ClientePessoaFisica bean) {
		this.bean = bean;
	}

	public List<ClientePessoaFisica> getList() {
		return list;
	}

	public void setList(List<ClientePessoaFisica> list) {
		this.list = list;
	}

	public void edit(RowEditEvent event) {
		ClientePessoaFisica p = (ClientePessoaFisica) event.getObject();
		this.controle.update(p);
		FacesMessage msg = new FacesMessage("Cliente alterado com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}


	public void cancelarEdicao() {

		System.out.println("cancelar edição");
	}

	public void delete(ClientePessoaFisica f) {
		this.controle.delete(f);
		this.list = controle.select();
		FacesMessage msg = new FacesMessage("Cliente EXCLUIDO com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void cadastrar() {
		this.controle.cadastrar(this.bean);
		this.init();
	}
}
