package br.com.full.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Vendedor extends Pessoa {
	
	private String cpf;
	@OneToMany( mappedBy = "vendedor", targetEntity = OS.class)
	private List<OS> os;

	
	public List<OS> getOs() {
		return os;
	}

	public void setOs(List<OS> os) {
		this.os = os;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
