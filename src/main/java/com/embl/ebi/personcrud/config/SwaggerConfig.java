package com.embl.ebi.personcrud.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * 
 * @author gabriel.machado
 * 
 * Swagger documentation for the project
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.embl.ebi.personcrud.resources"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		 return new ApiInfo(
		 "API - EMBL EBI Technical Assessment",
		 "",
		 "Vesion 1.0",
		 "https://www.linkedin.com/in/gabrieldmachado/?locale=en_US",
		 new Contact("Gabriel Machado", "https://github.com/GabrielDMachado92", "gabriel.d.machado92@gmail.com"),
		 "",
		 "",
		 Collections.emptyList() // Vendor Extensions
		);
		}
}