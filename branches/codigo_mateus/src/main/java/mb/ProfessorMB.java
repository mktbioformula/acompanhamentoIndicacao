package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Professor;
import controle.esp.ProfessorBCI;
import controle.impl.ProfessorBC;
import util.JSFUtil;

@ManagedBean(name = "ProfessorMB")
@SessionScoped
public class ProfessorMB {

	private Professor bean;
	private ProfessorBCI controle;
	private List<Professor> lista;

	@PostConstruct
	public void inicializar() {
		this.bean = new Professor();
		this.controle = new ProfessorBC();
		this.lista = controle.select();
	}

	public Professor getBean() {
		return bean;
	}

	public void setBean(Professor bean) {
		this.bean = bean;
	}

	public List<Professor> getLista() {
		return lista;
	}

	public void setLista(List<Professor> lista) {
		this.lista = lista;
	}

	public void gravar() {
		//insere o professor
		this.controle.insert(bean);
		
		//devolve mensagem de sucesso
		JSFUtil.adicionarMensagemSucesso(
				String.format("Professor %s cadastrado com sucesso", bean.getNome()));
		
		//atualiza informações da tela
		this.bean = new Professor();
		this.lista = controle.select();
	}

}
