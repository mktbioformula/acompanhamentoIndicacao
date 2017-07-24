package br.com.livraria.view.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity(debug = false)
public class WebApplicationSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	private final Properties users = new Properties();
	private final PasswordEncoder chave = new BCryptPasswordEncoder();

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
		// hasAnyRole("ROOT", "ADMIN")
		http.authorizeRequests().antMatchers("/aluno.jsf").hasAnyAuthority("ROOT", "ADMIN");
		http.authorizeRequests().anyRequest().authenticated();

		http.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("root").password(chave.encode("root")).authorities("ROOT").and()
				.passwordEncoder(chave);

		auth.userDetailsService(inMemoryUserDetailsManager()).passwordEncoder(chave);
	}

	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		// users.put("thiago", chave.encode("123")+", ROOT, enabled");

		InMemoryUserDetailsManager auth = new InMemoryUserDetailsManager(users);
		return auth;
	}

	/*
	 * @Bean public InMemoryUserDetailsManager
	 * inMemoryUserDetailsManager(Map<String, String> usersAut) { for
	 * (Entry<String, String> entry : usersAut.entrySet()) {
	 * System.out.println(entry.getKey()); System.out.println(entry.getValue());
	 * //chave.encode("123")+", ROOT, enabled" users.put(entry.getKey(),
	 * entry.getValue()); }
	 * 
	 * InMemoryUserDetailsManager auth = new InMemoryUserDetailsManager(users);
	 * return auth; }
	 */

}