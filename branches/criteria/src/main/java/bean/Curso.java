package bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "seq_curso", sequenceName = "curso_seq", initialValue = 1, allocationSize = 1)
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_curso")
	private Integer id;
	private String nome;
	@ManyToMany(targetEntity = Aluno.class, cascade = CascadeType.ALL)
	@JoinTable(name = "aluno_curso", joinColumns = @JoinColumn(name = "fk_curso"), inverseJoinColumns = @JoinColumn(name = "fk_aluno"))
	private List<Aluno> alunos;
	@OneToOne(cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY)
	private Professor professor;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_escola")
	private Escola escola;
	
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
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
}
