package bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_emprestimo", sequenceName = "emprestimo_seq", initialValue = 1)
public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_emprestimo")
	private Integer id;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "livro_emprestimo",
			joinColumns = { @JoinColumn(name = "emprestimo_id") }, inverseJoinColumns = {
					@JoinColumn(name = "livro_id") })
	private List<Livro> livros;
	@OneToOne
	private Usuario usuario;
	@OneToOne
	private Cliente cliente;
	private Date inicio;
	private Date fim;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

}
