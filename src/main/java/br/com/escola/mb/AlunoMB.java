package br.com.escola.mb;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.escola.bean.Aluno;
import br.com.escola.controle.esp.AlunoBCI;
import br.com.escola.util.JSFUtil;

@ManagedBean(name = "AlunoMB")
@Scope("view")
public class AlunoMB extends SpringBeanAutowiringSupport {

	private Aluno bean;
	@Autowired
	private AlunoBCI controle;
	private List<Aluno> lista;
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Aluno();
		this.lista = controle.select();
	}

	public Aluno getBean() {
		return bean;
	}

	public void setBean(Aluno bean) {
		this.bean = bean;
	}

	public List<Aluno> getLista() {
		return lista;
	}

	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}
	
	public void gravar() {
		//insere o aluno
		this.controle.insert(bean);
		
		//devolve mensagem de sucesso
		JSFUtil.adicionarMensagemSucesso(
				String.format("Aluno %s cadastrado com sucesso.", bean.getNome()));
		
		//atualiza informações da tela
		this.bean = new Aluno();
		this.lista = controle.select();
	}
	
}
