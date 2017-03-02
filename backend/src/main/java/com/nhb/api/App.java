package com.nhb.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		
		return new EmbeddedServletContainerCustomizer() {
			
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/"));
			}
		};
	}
}
