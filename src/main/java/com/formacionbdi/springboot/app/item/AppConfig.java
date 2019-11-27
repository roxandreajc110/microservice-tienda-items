package com.formacionbdi.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	/*
	 * Registramos un Bean en el contenedor de tipo RestTemplate con nombre:
	 * "clienteRest"
	 */
	@Bean("clienteRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
