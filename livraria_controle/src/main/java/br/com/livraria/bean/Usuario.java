package br.com.livraria.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_usuario", 
sequenceName = "usuario_seq")
public class Usuario {

	@Id
	@GeneratedValue(strategy 
			= GenerationType.SEQUENCE , 
			generator = "seq_usuario")
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private Integer tipo;
	@OneToMany(targetEntity = Emprestimo.class 
			, mappedBy = "usuario")
	private List<Emprestimo> emprestimos;

	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
}
