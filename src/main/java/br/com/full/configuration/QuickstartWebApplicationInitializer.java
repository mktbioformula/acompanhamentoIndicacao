package br.com.full.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


@Configuration
@ComponentScan(basePackages = { "br.com.full" })
@Order(1)
public class QuickstartWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { QuickstartWebApplicationInitializer.class };
	}

	/**
	 * {@link WebApplicationConfigurerAdapter} and
	 * {@link WebApplicationSecurityConfigurerAdapter} already being scanned.
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/rest/*" };
	}

}