package br.com.full.bean;

import javax.persistence.Entity;

@Entity
public class ClientePessoaJuridica  extends Cliente{
	
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
