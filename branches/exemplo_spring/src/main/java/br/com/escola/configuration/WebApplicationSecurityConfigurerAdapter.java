package br.com.escola.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity(debug = false)
public class WebApplicationSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	/*Configuração do spring security*/
	//https://docs.spring.io/spring-security/site/docs/current/reference/html/jc.html
	
	//https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin().loginPage("/login.jsf").loginProcessingUrl("/login.jsf").defaultSuccessUrl("/index.jsf")
				.failureUrl("/login.xhtml?source=loginError").permitAll();

		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/resources/**", "/javax.faces.resource/**").permitAll();
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/login.jsf?source=logout").permitAll();
		

		
		http.authorizeRequests().antMatchers("/aluno.jsf").hasRole("ROOT");
		http.authorizeRequests().anyRequest().authenticated();

		http.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("root").password("root").roles("ROOT");
	}

}