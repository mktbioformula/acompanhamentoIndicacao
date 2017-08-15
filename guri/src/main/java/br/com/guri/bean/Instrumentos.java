package br.com.guri.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity 
@SequenceGenerator(name = "seq_intrumentos", sequenceName = "intrumentos_seq", initialValue = 1)
public class Instrumentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_instrumentos")
	private Integer id;
	private String nome;
	
	@ManyToOne(targetEntity = Tipo.class )
	@JoinColumn(name = "fk_tipo")
	private List<Tipo>tipo;
	
	
	
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
	public List<Tipo> getTipo() {
		return tipo;
	}
	public void setTipo(List<Tipo> tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
