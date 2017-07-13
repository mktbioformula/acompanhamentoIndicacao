package bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name = "seq_diciplina", sequenceName = "diciplina_seq")
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_diciplina")
	private Integer id;
	private String nome;
	@Column(name = "carga_horaria")
	private Integer cargaHoraria;
	@ManyToMany(targetEntity = Curso.class, mappedBy = "disciplinas")
	private List<Curso> cursos;
	@OneToOne
	private Professor professor;

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

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
