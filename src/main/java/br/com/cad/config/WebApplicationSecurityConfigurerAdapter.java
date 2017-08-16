package br.com.cad.config;

import javax.resource.spi.AuthenticationMechanism;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity(debug = false)
public class WebApplicationSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	private final PasswordEncoder chave = new BCryptPasswordEncoder();

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin().defaultSuccessUrl("/cad_pessoa.jsf");
		http.authorizeRequests().antMatchers("/resources/**", "/javax.faces.resource/**").permitAll();
		http.authorizeRequests().anyRequest().authenticated();
		http.csrf().disable();
	}
	// https://docs.spring.io/spring-security/site/docs/current/guides/html5/form-javaconfig.html

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("root").password(chave.encode("root")).authorities("ADMIN").and()
				.passwordEncoder(chave);
		;

	}

}