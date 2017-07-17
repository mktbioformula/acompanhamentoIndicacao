package br.com.escola.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity(debug = false)
public class WebApplicationSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin() 
				.loginPage("/login.jsf") 
				.loginProcessingUrl("/login.jsf") 
				.defaultSuccessUrl("/index.jsf") 
				.failureUrl("/login.xhtml?source=loginError") 
				.permitAll();

		http.authorizeRequests()
				.antMatchers("/").permitAll() 
				.antMatchers("/index.html").authenticated() 
				.antMatchers("/public/**", "/resources/**", "/javax.faces.resource/**").permitAll();

		http.authorizeRequests() 
				.anyRequest().authenticated();

		http.logout() 
				.logoutUrl("/logout") 
				.logoutSuccessUrl("/login.jsf?source=logout") 
				.permitAll();
		http.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication() 
				.withUser("admin") 
				.password("123456") 
				.roles("ADMIN");
	}

}