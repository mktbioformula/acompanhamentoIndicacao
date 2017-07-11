package mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import bean.Emprestimo;
import bean.Livro;
import controle.esp.EmprestimoBCI;
import controle.impl.EmprestimoBC;

@ManagedBean(name = "EmprestimoMB")
@ViewScoped
public class EmprestimoMB {

	private EmprestimoBCI controle;
	private Emprestimo bean;
	private List<Emprestimo> list;
	private List<Livro> livros;

	@PostConstruct
	public void init() {
		this.controle = new EmprestimoBC();
		this.list = controle.select();
		this.bean = new Emprestimo();
	}

	public Emprestimo getBean() {
		return bean;
	}

	public void setBean(Emprestimo bean) {
		this.bean = bean;
	}

	public List<Emprestimo> getList() {
		return list;
	}

	public void setList(List<Emprestimo> list) {
		this.list = list;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public void insert() {
		this.bean.setLivros(this.livros);
		this.controle.insert(this.bean);
		this.bean = new Emprestimo();
		this.livros = new ArrayList<Livro>();
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Ok", "Emprestimo realizado com sucesso! "));

	}

}



