package mb;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import bean.Disciplina;
import bean.Professor;
import controle.esp.DisciplinaBCI;
import controle.esp.ProfessorBCI;
import controle.impl.DisciplinaBC;
import controle.impl.ProfessorBC;
import util.JSFUtil;

@ManagedBean(name = "DisciplinaMB")
@ViewScoped
public class DisciplinaMB {

	private Disciplina bean;
	private DisciplinaBCI controle;
	private List<Disciplina> lista;
	
	@PostConstruct
	public void inicializar() {
		//TODO MOSTRAR O TÍTULO DA PÁGINA
		//TODO SE O PROFESSOR JA TEM DISCIPLINA, NAO DEVERIA MOSTRA-LO. OU MOSTRA E PERGUNTA
		//SE QUER MUDAR A DISCIPLINA DELE. DAÍ ATUALIZA
		this.bean = new Disciplina();
		this.controle = new DisciplinaBC();
		this.lista = controle.select();
	}

	public Disciplina getBean() {
		return bean;
	}

	public void setBean(Disciplina bean) {
		this.bean = bean;
	}

	public List<Disciplina> getLista() {
		return lista;
	}

	public void setLista(List<Disciplina> lista) {
		this.lista = lista;
	}
	
	public void gravar() {
		//insere a disciplina
		this.controle.insert(bean);
		
		//atualiza o professor
		Professor professorSelecionado = bean.getProfessor();
		professorSelecionado.setDisciplina(bean);
		ProfessorBCI controleProfessor = new ProfessorBC();
		controleProfessor.update(professorSelecionado);
		
		//devolve mensagem de sucesso
		JSFUtil.adicionarMensagemSucesso(
				String.format("Disciplina %s cadastrada com sucesso.", bean.getNome()));
		
		//atualiza informações da tela
		this.bean = new Disciplina();
		this.lista = controle.select();
	}
	
}
