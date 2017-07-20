package br.com.escola.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.escola.bean.Aluno;
import br.com.escola.controle.esp.AlunoBCI;
import br.com.escola.util.JSFUtil;

@ManagedBean(name = "AlunoMB")
@Scope("view")
public class AlunoMB extends SpringBeanAutowiringSupport {

	private Aluno bean;
	@Autowired
	private AlunoBCI controle;
	private List<Aluno> lista;

	@Autowired
	private UserDetailsManager inMemoryUserDetailsManager;

	

	@PostConstruct
	public void inicializar() {
		this.bean = new Aluno();
		this.lista = controle.select();
		//this.inMemoryUserDetailsManager = inMemoryUserDetailsManager;
	}

	public Aluno getBean() {
		return bean;
	}

	public void setBean(Aluno bean) {
		this.bean = bean;
	}

	public List<Aluno> getLista() {
		return lista;
	}

	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}

	public void gravar() {
		// insere o aluno
		this.controle.insert(bean);

		// devolve mensagem de sucesso
		JSFUtil.adicionarMensagemSucesso(String.format("Aluno %s cadastrado com sucesso.", bean.getNome()));

		// atualiza informações da tela
		this.bean = new Aluno();
		this.lista = controle.select();
		
		List<GrantedAuthority> l = new ArrayList<GrantedAuthority>();
		GrantedAuthority s = new SimpleGrantedAuthority("ADMIN");
		l.add(s);
		
		PasswordEncoder chave = new BCryptPasswordEncoder();
		
        inMemoryUserDetailsManager.createUser(new User("master", chave.encode("master") , l ));


	}

}
