package bean;

import java.util.Calendar;

public class Pessoa {
	private String nome;
	private String email;
	private String endereco;
	private String telefone;
	private Calendar nascimento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}	
}
