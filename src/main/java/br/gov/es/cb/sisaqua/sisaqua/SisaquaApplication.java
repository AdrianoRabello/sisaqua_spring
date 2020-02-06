package br.gov.es.cb.sisaqua.sisaqua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class SisaquaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisaquaApplication.class, args); 
	}
	
	
	// Este método abaixo é para gerar configurar para gerar o war
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SisaquaApplication.class);
	}
	
	

}
