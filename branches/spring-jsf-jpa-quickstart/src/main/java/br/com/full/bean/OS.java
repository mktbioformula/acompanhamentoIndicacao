package br.com.full.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name = "seq_os", sequenceName = "os_seq", initialValue = 1, allocationSize = 1)
public class OS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_os")
	private Integer id;
	private Date data;
	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private Cliente cliente;
	private String servico;
	private Integer quantidade;
	private String numeracao;
	private String cor;
	@ManyToOne
	@JoinColumn(name = "fk_formato")
	private Formato formato;
	@ManyToOne
	@JoinColumn(name = "fk_papel")
	private Papel papel;
	@Enumerated(EnumType.STRING)
	private Picote picote;
	@Enumerated(EnumType.STRING)
	private Cola cola;
	private Boolean grampo;
	private Integer quantidadeVias;
	private String viasPicotadas;
	private String observacao;
	@ManyToOne
	@JoinColumn(name = "fk_vendedor")
	private Vendedor vendedor;
	private Double valor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getNumeracao() {
		return numeracao;
	}
	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public Papel getPapel() {
		return papel;
	}
	public void setPapel(Papel papel) {
		this.papel = papel;
	}
	public Picote getPicote() {
		return picote;
	}
	public void setPicote(Picote picote) {
		this.picote = picote;
	}
	public Cola getCola() {
		return cola;
	}
	public void setCola(Cola cola) {
		this.cola = cola;
	}
	public Boolean getGrampo() {
		return grampo;
	}
	public void setGrampo(Boolean grampo) {
		this.grampo = grampo;
	}
	public Integer getQuantidadeVias() {
		return quantidadeVias;
	}
	public void setQuantidadeVias(Integer quantidadeVias) {
		this.quantidadeVias = quantidadeVias;
	}
	public String getViasPicotadas() {
		return viasPicotadas;
	}
	public void setViasPicotadas(String viasPicotadas) {
		this.viasPicotadas = viasPicotadas;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
