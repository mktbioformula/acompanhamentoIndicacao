package br.com.escola.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
// @SequenceGenerator(name = "seq_curso", sequenceName = "curso_seq",
// initialValue = 1)
public class Curso {
	@Id
	@GeneratedValue
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "seq_curso")
	private Integer id;
	private String codigo;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "curso_disciplina", joinColumns = { @JoinColumn(name = "fk_curso") }, inverseJoinColumns = {
			@JoinColumn(name = "fk_disciplina") })
	private List<Disciplina> disciplinas;

	@OneToMany(targetEntity = Turma.class, mappedBy = "curso", fetch = FetchType.LAZY)
	private List<Turma> turmas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return this.getCodigo();
	}
}
