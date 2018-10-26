package it.unical.asde2018.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("it.unical.asde2018.controllers")
public class ServletConfiguration {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		return new InternalResourceViewResolver("WEB-INF/views/",".jsp");
	}
	

}
