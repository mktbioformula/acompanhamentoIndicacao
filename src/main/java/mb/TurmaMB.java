package mb;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Turma;
import controle.esp.TurmaBCI;
import controle.impl.TurmaBC;
import util.JSFUtil;

@ManagedBean(name = "TurmaMB")
@SessionScoped
public class TurmaMB {

	private Turma bean;
	private TurmaBCI controle;
	private List<Turma> lista;
	
	@PostConstruct
	public void inicializar() {
		//TODO SELECIONAR CURSOS E MOSTRAR
		//TODO SELECIONAR ALUNOS E MOSTRAR. ALUNOS NUMA TURMA, O QUE FAZER?
		this.bean = new Turma();
		this.controle = new TurmaBC();
		this.lista = controle.select();
	}

	public Turma getBean() {
		return bean;
	}

	public void setBean(Turma bean) {
		this.bean = bean;
	}

	public List<Turma> getLista() {
		return lista;
	}

	public void setLista(List<Turma> lista) {
		this.lista = lista;
	}
	
	public void gravar() {
		//insere a turma
		this.controle.insert(bean);
		
		//devolve mensagem de sucesso
		JSFUtil.adicionarMensagemSucesso(
				String.format("Turma %s cadastrado com sucesso.", bean.getCodigo()));
		
		//atualiza informações da tela
		this.bean = new Turma();
		this.lista = controle.select();
	}
	
}
