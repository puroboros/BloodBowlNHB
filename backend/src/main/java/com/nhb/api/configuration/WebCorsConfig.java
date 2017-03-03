package com.nhb.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebCorsConfig {

	@Bean
	public WebMvcConfigurer corsConfigurer() {

		return new WebMvcConfigurerAdapter() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {

				registry.addMapping("/**")
						.allowedMethods(HttpMethod.DELETE.name(), HttpMethod.GET.name(), HttpMethod.OPTIONS.name(),
								HttpMethod.POST.name(), HttpMethod.PUT.name())
						.maxAge(3600L).allowedHeaders(HttpHeaders.CONTENT_TYPE, HttpHeaders.ACCEPT, "X-Requested-With",
								"remember-me");
			}
		};
	}

}
