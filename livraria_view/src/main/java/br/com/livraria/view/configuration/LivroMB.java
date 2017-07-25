package br.com.livraria.view.configuration;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.faces.webflow.JsfUtils;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.livraria.bean.Livro;
import br.com.livraria.controle.esp.LivroBCI;
import br.com.livraria.view.util.JSFUtil;

@ManagedBean(name = "LivroMB")
@Scope("view")
public class LivroMB extends SpringBeanAutowiringSupport {

	private Livro bean;
	
	@Autowired
	private LivroBCI controle;
	private List<Livro> lista;
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Livro();
		this.lista = controle.select();
	}

	public Livro getBean() {
		return bean;
	}

	public void setBean(Livro bean) {
		this.bean = bean;
	}

	public List<Livro> getLista() {
		return lista;
	}

	public void setLista(List<Livro> lista) {
		this.lista = lista;
	}

	public void insert() {
		this.controle.insert(bean);
		JSFUtil.adicionarMensagemSucesso(String.format("Livro %s cadastrado com sucesso.", bean.getNome()));
		
		this.bean = new Livro();
		this.lista = controle.select();		
	}

	public void update() {
		this.controle.update(bean);
		JSFUtil.adicionarMensagemSucesso(String.format("Livro %s alterado com sucesso.", bean.getNome()));
		
		this.bean = new Livro();
		this.lista = controle.select();		
	}	
	
	public void delete() {
		this.controle.delete(bean);
		JSFUtil.adicionarMensagemSucesso(String.format("Livro %s excluido com sucesso.", bean.getNome()));
		
		this.bean = new Livro();
		this.lista = controle.select();		
	}	
}
