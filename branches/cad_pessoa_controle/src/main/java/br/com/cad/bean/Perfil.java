package br.com.cad.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_perfil",
sequenceName = "perfil_seq")
public class Perfil {

	@Id
	@GeneratedValue(strategy = 
	GenerationType.SEQUENCE, generator = "seq_perfil")
	private Integer id;
	private String nome;
	@ManyToMany(targetEntity = Usuario.class,
			mappedBy = "perfis")
	private List<Usuario> usuarios;
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
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
	
	
}
