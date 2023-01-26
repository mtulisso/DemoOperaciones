package com.demoOperaciones;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class DemoOperacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOperacionesApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Resolución API").version("v1.0.0")
				.description("Proyecto ResolucionApi - Marcos Tulisso")
				.contact(new Contact().name("Marcos Tulisso").email("tulisso@email.com.ar")));
				//.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
