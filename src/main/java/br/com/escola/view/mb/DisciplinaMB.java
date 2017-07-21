package br.com.escola.view.mb;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@ManagedBean(name = "DisciplinaMB")
@Scope("view")
public class DisciplinaMB extends SpringBeanAutowiringSupport {/*

	@Autowired
	private DisciplinaBCI controle;
	private List<Disciplina> list;
	private Disciplina bean;
	
	@PostConstruct
	public void init(){
		list = controle.select();
		this.bean = new Disciplina();
	}

	public List<Disciplina> getList() {
		return list;
	}

	public void setList(List<Disciplina> list) {
		this.list = list;
	}

	public Disciplina getBean() {
		return bean;
	}

	public void setBean(Disciplina bean) {
		this.bean = bean;
	}
	
	public void insert(){
		this.controle.insert(this.bean);
		
		JSFUtil.adicionarMensagemSucesso(
				String.format("Disciplina %s cadastrado com sucesso.", bean.getNome()));

		this.init();
		
	}*/

}






		
		
		
		
		
