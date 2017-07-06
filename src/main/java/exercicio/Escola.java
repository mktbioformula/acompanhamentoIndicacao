package exercicio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_escola", sequenceName = "escola_seq", initialValue = 1)
public class Escola {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_escola")
	private Integer id;

	/**
	 * Uma escola tem muitos cursos.
	 */
	@OneToMany(targetEntity = Curso.class, mappedBy = "escola")
	private List<Curso> cursos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
