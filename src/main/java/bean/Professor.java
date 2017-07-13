package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_professor", sequenceName = "professor_seq")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_professor")
	private Integer id;
	private String nome;
	@OneToOne
	private Disciplina diciplina;
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
	/*public Disciplina getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(Disciplina diciplina) {
		this.diciplina = diciplina;
	}*/
}
