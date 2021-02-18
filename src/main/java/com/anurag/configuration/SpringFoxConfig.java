package com.anurag.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
	
	
	private static final String title = "Database Mapping Learn";
	private static final String description = "APi details";
	private static final String SwaggerVersion = "1.0";
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder() //object of apiinfoBuilder to call title.....
				.title(title).description(description).version(SwaggerVersion).build();
	}
	

	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2) 
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
		
	}
}
