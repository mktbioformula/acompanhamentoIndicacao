package br.com.full.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "papel")
@SequenceGenerator(name = "seq_papel", sequenceName = "papel_seq", initialValue = 1, allocationSize = 1)
public class Papel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_papel")
	private Integer id;
	private String nome;
	private Double altura;
	private Double largura;
	private Double gramatura;
	private Integer nFolhas;
	private Double valorPacote;
	@OneToMany( mappedBy = "papel", targetEntity = OS.class)
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

	public void setnFolhas(Integer nFolhas) {
		this.nFolhas = nFolhas;
	}

	public Integer getnFolhas() {
		return nFolhas;
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

	public Double getGramatura() {
		return gramatura;
	}

	public void setGramatura(Double gramatura) {
		this.gramatura = gramatura;
	}

	public Double getValorPacote() {
		return valorPacote;
	}

	public void setValorPacote(Double valorPacote) {
		this.valorPacote = valorPacote;
	}
}
