package exercicio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_professor", sequenceName = "professor_seq", initialValue = 1)
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_professor")
	private Integer id;

	/**
	 * Um professor dá aula em apenas um curso.
	 */
	@OneToOne
	private Curso curso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
