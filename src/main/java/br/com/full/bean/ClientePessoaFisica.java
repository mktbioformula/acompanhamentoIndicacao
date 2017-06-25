package br.com.full.bean;

import javax.persistence.Entity;

@Entity
public class ClientePessoaFisica extends Cliente {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
