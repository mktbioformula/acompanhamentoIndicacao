package br.com.cad.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.cad.bean.Pessoa;
import br.com.cad.controle.esp.PessoaBCI;

@ManagedBean(name = "PessoaMB")
public class PessoaMB extends SpringBeanAutowiringSupport{

	@Autowired
	private PessoaBCI controle;
	private List<Pessoa> list;
	private Pessoa bean;
	
	@PostConstruct
	public void init(){
		this.bean = new Pessoa();
		this.list = controle.select();
	}

	public List<Pessoa> getList() {
		return list;
	}

	public void setList(List<Pessoa> list) {
		this.list = list;
	}

	public Pessoa getBean() {
		return bean;
	}

	public void setBean(Pessoa bean) {
		this.bean = bean;
	}
	
	
	public void salvar(){
		this.controle.insert(this.bean);
		this.init();
	}
	
}
