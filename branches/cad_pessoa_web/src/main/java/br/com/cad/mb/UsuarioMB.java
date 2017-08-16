package br.com.cad.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.cad.bean.Pessoa;
import br.com.cad.bean.Usuario;
import br.com.cad.controle.esp.PessoaBCI;
import br.com.cad.controle.esp.UsuarioBCI;

@ManagedBean(name = "UsuarioMB")
public class UsuarioMB extends SpringBeanAutowiringSupport{

	@Autowired
	private UsuarioBCI controle;
	private List<Usuario> list;
	private Usuario bean;
	
	@PostConstruct
	public void init(){
		this.bean = new Usuario();
		this.list = controle.select();
	}
	
	public List<Usuario> getList() {
		return list;
	}

	public void setList(List<Usuario> list) {
		this.list = list;
	}

	public Usuario getBean() {
		return bean;
	}

	public void setBean(Usuario bean) {
		this.bean = bean;
	}

	public void salvar(){
		this.controle.insert(this.bean);
		this.init();
	}
	
}
