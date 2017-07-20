package br.com.escola.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.escola.bean.Aluno;
import br.com.escola.controle.esp.AlunoBCI;

@Configuration
@EnableWebSecurity(debug = false)
public class WebApplicationSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	@Autowired
	private AlunoBCI controleAluno;
	
	/* Configuração do spring security */
	// https://docs.spring.io/spring-security/site/docs/current/reference/html/jc.html

	// https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin().loginPage("/login.jsf").loginProcessingUrl("/login.jsf").defaultSuccessUrl("/index.jsf")
				.failureUrl("/login.jsf?source=loginError").permitAll();

		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/resources/**", "/javax.faces.resource/**").permitAll();
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/login.jsf?source=logout").permitAll();

		http.authorizeRequests().antMatchers("/aluno.jsf").hasRole("ROOT");
		http.authorizeRequests().anyRequest().authenticated();

		http.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		PasswordEncoder chave = new BCryptPasswordEncoder();

		List<Aluno> list = controleAluno.select();
		
		for (Aluno aluno : list) {
			
			String senhaAdmin = chave.encode("123456");
			auth.inMemoryAuthentication().withUser("admin").password(senhaAdmin).roles("ADMIN").and()
			.passwordEncoder(chave);
		}
		
		
		
		
		
		auth.inMemoryAuthentication().withUser("root").password(chave.encode("root")).roles("ROOT").and()
		.passwordEncoder(chave);
	}

}