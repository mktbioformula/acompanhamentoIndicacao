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

import br.com.full.bean.ClientePessoaJuridica;
import br.com.full.bean.Formato;
import br.com.full.bean.Papel;
import br.com.full.controle.ClientePessoaJuridicaBCI;


@ManagedBean(name = "ClientePessoaJuridicaMB")
@Scope("view")
public class ClientePessoaJuridicaMB extends SpringBeanAutowiringSupport{
	
	private ClientePessoaJuridica bean;
	@Autowired
	private ClientePessoaJuridicaBCI controle;
	private List<ClientePessoaJuridica> list;
	
	@PostConstruct
	public void init() {
		this.list = controle.select();
		this.bean = new ClientePessoaJuridica();
	}

	public ClientePessoaJuridica getBean() {
		return bean;
	}

	public void setBean(ClientePessoaJuridica bean) {
		this.bean = bean;
	}

	public List<ClientePessoaJuridica> getList() {
		return list;
	}

	public void setList(List<ClientePessoaJuridica> list) {
		this.list = list;
	}

	public void delete(ClientePessoaJuridica c) {
		this.controle.delete(c);		
		this.list = controle.select();
		FacesMessage msg = new FacesMessage("Cliente EXCLUIDO com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);		
	}
	
	public void edit(RowEditEvent event) {
		ClientePessoaJuridica c = (ClientePessoaJuridica) event.getObject();
		this.controle.update(c);
		FacesMessage msg = new FacesMessage("Cliente alterado com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}
	
	public void delete(RowEditEvent event) {
		ClientePessoaJuridica c = (ClientePessoaJuridica) event.getObject();
		System.out.println(c.getNome());
	}

	public void cancelarEdicao() {

		System.out.println("cancelar edição");
	}

	public void cadastrar() {
		this.controle.cadastrar(this.bean);
		this.init();
	}
	
	
}
