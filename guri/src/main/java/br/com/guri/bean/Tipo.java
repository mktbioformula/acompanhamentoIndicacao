package br.com.guri.bean;

import javax.persistence.OneToMany;


public class Tipo {
	
	private Integer id;
	private String Tipo;
	
	@OneToMany(targetEntity = Instrumentos.class,
			mappedBy = "tipo")
	private Instrumentos intrumentos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Instrumentos getIntrumentos() {
		return intrumentos;
	}

	public void setIntrumentos(Instrumentos intrumentos) {
		this.intrumentos = intrumentos;
	}
	
	
	
	
	

}
