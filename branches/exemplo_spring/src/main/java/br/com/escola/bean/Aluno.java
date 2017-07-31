package br.com.escola.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
// @SequenceGenerator(name = "seq_aluno", sequenceName = "aluno_seq")
public class Aluno {

	@Id
	@GeneratedValue
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "seq_aluno")
	private Integer id;
	private String nome;
	@ManyToOne(targetEntity = Turma.class)
	@JoinColumn(name = "fk_turma")
	private Turma turma;
	
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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}

}