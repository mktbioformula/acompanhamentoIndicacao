package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Curso;
import bean.Disciplina;
import bean.Turma;
import controle.esp.CursoBCI;
import controle.impl.CursoBC;
import util.JSFUtil;

@ManagedBean(name = "CursoMB")
@SessionScoped
public class CursoMB {

	private Curso bean;
	private CursoBCI controle;
	private List<Curso> lista;
	private List<Curso> listaFiltrada;

	@PostConstruct
	public void inicializar() {
// TODO como eu faço um obter somente quando o usuario clicar no pesquisar?
		
		this.controle = new CursoBC();
		this.lista = controle.select();
		this.bean = new Curso();
	}

	public Curso getBean() {
		return bean;
	}

	public void setBean(Curso bean) {
		this.bean = bean;
	}

	public List<Curso> getLista() {
		return lista;
	}

	public void setLista(List<Curso> lista) {
		this.lista = lista;
	}

	public List<Curso> getListaFiltrada() {
		return listaFiltrada;
	}

	public void setListaFiltrada(List<Curso> listaFiltrada) {
		this.listaFiltrada = listaFiltrada;
	}

	public void gravar() {
		// insere o curso
		this.controle.insert(bean);

		// devolve mensagem de sucesso
		JSFUtil.adicionarMensagemSucesso(String.format("Curso %s cadastrado com sucesso.", bean.getCodigo()));

		// atualiza informações da tela
		this.bean = new Curso();
		this.lista = controle.select();
	}
	
	public void obter() {
		this.bean = this.controle.findById(this.bean);
	}
}
