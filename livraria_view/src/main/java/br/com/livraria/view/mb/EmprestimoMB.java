package br.com.livraria.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.livraria.bean.Emprestimo;
import br.com.livraria.bean.Genero;
import br.com.livraria.controle.esp.EmprestimoBCI;
import br.com.livraria.view.util.JSFUtil;

@ManagedBean(name="EmprestimoMB")
@Scope("view")
public class EmprestimoMB extends SpringBeanAutowiringSupport {
	
	private Emprestimo bean;
	@Autowired
	private EmprestimoBCI controle;
	private List<Emprestimo> lista;
	
	@PostConstruct
	public void init() {
		this.bean = new Emprestimo();
		this.lista = controle.select();
	}

	public Emprestimo getBean() {
		return bean;
	}

	public void setBean(Emprestimo bean) {
		this.bean = bean;
	}

	public List<Emprestimo> getLista() {
		return lista;
	}

	public void setLista(List<Emprestimo> lista) {
		this.lista = lista;
	}
	
	public void gravar() {
		this.controle.inserir(bean);
		
		JSFUtil.adicionarMensagemSucesso(String.format("Emprestimo %s realizado com sucesso.", bean.getCliente()));
		
		this.bean = new Emprestimo();
		this.lista = controle.select();

	}
	
}
	
	
