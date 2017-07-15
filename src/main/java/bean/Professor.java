package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
// @SequenceGenerator(name = "seq_professor", sequenceName = "professor_seq")
public class Professor {
	@Id
	@GeneratedValue
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "seq_professor")
	private Integer id;
	private String nome;
	@OneToOne
	private Disciplina disciplina;

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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
