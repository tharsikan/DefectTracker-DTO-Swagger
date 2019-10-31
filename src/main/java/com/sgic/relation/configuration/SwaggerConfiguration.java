package com.sgic.relation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration							// give values(probates,constructor) for Classes
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean								// which make that class obj as a Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sgic.relation.controller"))
				.paths(PathSelectors.any())
				.build();
//				.apiInfo(metaData());
	}
	
	
	// @Bean you can use @Component && @ComponentScan
	// When this app starts we call ClassPathXMLAppContext(AppCOnfig.XML)
	// or	AppincationContext cntx = AnnotationConfigAppContext(SwaggerConfiguration.class)
	// now for Use particular Bean cntx.getBean("Docket.class")
	// but someHow spring boot do this
}
