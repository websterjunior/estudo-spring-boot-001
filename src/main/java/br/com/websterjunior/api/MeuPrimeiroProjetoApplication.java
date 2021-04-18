package br.com.websterjunior.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {

	@Value("${nome.aplicacao}")
	private String nomeAplicacao;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner () {
		return args -> {
			System.out.println("INICIALIZANDO O PROJETO: " + this.nomeAplicacao);
		};
	}
	
	
}
