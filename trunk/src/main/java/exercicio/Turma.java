package exercicio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_turma", sequenceName = "turma_seq", initialValue = 1)
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_turma")
	private Integer id;

	/**
	 * Uma turma tem vários alunos.
	 */
	@OneToMany(targetEntity = Aluno.class, mappedBy = "turma")
	private List<Aluno> alunos;

	/**
	 * Uma turma possui muitos cursos
	 */
	@ManyToMany(mappedBy = "turmas")
	private List<Curso> cursos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
