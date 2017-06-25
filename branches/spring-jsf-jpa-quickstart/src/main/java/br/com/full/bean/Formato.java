package br.com.full.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_formato", sequenceName = "formato_seq")
public class Formato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_formato")
	private Integer id;
	private String nome;
	private Double altura;
	private Double largura;
	private Boolean ativo;
	@OneToMany( mappedBy = "formato", targetEntity = OS.class)
	private List<OS> os;
	
	public List<OS> getOs() {
		return os;
	}
	public void setOs(List<OS> os) {
		this.os = os;
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
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
