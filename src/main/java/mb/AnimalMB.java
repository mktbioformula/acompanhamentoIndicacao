package mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import bean.Animal;
import controle.esp.AnimalBCI;
import controle.impl.AnimalBC;

@ManagedBean(name = "AnimalMB")
@SessionScoped
public class AnimalMB {
	
	private Animal bean;
	private List<Animal> list;
	private AnimalBCI controle;

	public Animal getBean() {
		return bean;
	}

	public void setBean(Animal bean) {
		this.bean = bean;
	}

	public List<Animal> getList() {
		return list;
	}

	public void setList(List<Animal> list) {
		this.list = list;
	}
	
	@PostConstruct
	public void inicializar() {
		this.bean = new Animal();
		this.controle = new AnimalBC();
		this.list = controle.select();
	}

	public void gravar() {
		this.controle.insert(this.bean);
		this.bean = new Animal();
		this.list = controle.select();
	}

}
