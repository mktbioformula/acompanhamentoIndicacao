package br.com.livraria.ws.bean;

public class Usuario {

	private Integer id;
	private String nome;
	private String fone;
	
	public Usuario(){}
	
	
	public Usuario(Integer id, String nome, String fone) {
		this.id = id;
		this.nome = nome;
		this.fone = fone;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
}
