package mb;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Aluno;
import controle.esp.AlunoBCI;
import controle.impl.AlunoBC;
import util.JSFUtil;

@ManagedBean(name = "AlunoMB")
@SessionScoped
public class AlunoMB {

	private Aluno bean;
	private AlunoBCI controle;
	private List<Aluno> lista;
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Aluno();
		this.controle = new AlunoBC();
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
