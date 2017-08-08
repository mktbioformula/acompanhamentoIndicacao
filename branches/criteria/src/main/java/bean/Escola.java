package bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "seq_escola", sequenceName = "escola_seq", initialValue = 1, allocationSize = 1)
public class Escola {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_escola")
	private Integer id;
	private String nome;
	private String endereco;
	@OneToMany(mappedBy = "escola", 
			cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY)
	private List<Curso> cursos;
	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
