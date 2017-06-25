package br.com.full.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public abstract class Cliente extends Pessoa {
	
	@OneToMany( mappedBy = "cliente", targetEntity = OS.class)
	private List<OS> os;

	public List<OS> getOs() {
		return os;
	}

	public void setOs(List<OS> os) {
		this.os = os;
	}
}
