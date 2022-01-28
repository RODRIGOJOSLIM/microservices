package com.devsuperior.payroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	//criando componente a partir da chamada de método
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
