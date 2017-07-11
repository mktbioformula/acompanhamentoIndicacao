package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Lote;
import controle.esp.LoteBCI;
import controle.impl.LoteBC;

@ManagedBean(name = "LoteMB")
@SessionScoped
public class LoteMB {
	
	private Lote bean;
	private List<Lote> list;
	private LoteBCI controle;

	public Lote getBean() {
		return bean;
	}

	public void setBean(Lote bean) {
		this.bean = bean;
	}

	public List<Lote> getList() {
		return list;
	}

	public void setList(List<Lote> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Lote();
		this.controle = new LoteBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Lote();
		this.list = controle.select();
	}

}
