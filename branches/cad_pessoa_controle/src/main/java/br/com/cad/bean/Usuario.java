package br.com.cad.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_usuario",
sequenceName = "usuario_seq")
public class Usuario {

	@Id
	@GeneratedValue(strategy = 
	GenerationType.SEQUENCE, generator = "seq_usuario")
	private Integer id;
	private String login;
	private String senha;
	
	@ManyToMany
	@JoinTable(name = "usuario_perfil" ,
	joinColumns = { @JoinColumn(name = "usuario_id")},
	inverseJoinColumns = {
					@JoinColumn(name = "perfil_id") }
			)
	private List<Perfil> perfis;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}
}
