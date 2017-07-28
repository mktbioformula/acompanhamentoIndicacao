package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cerveja {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Double teorAlcoolico;
	private String tipo;
	private Double preco;
	private String cor;
	
	
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
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
	public Double getTeorAlcoolico() {
		return teorAlcoolico;
	}
	public void setTeorAlcoolico(Double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}