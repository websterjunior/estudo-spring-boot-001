package br.com.websterjunior.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.websterjunior.api.utils.SenhaUtils;

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
			
			String senha = "MinhaSenha12345";
			String senhaEncoder = SenhaUtils.gerarBCrypt(senha);

			if(SenhaUtils.validaSenha(senha, senhaEncoder)) {
				System.out.println("Senha OK: " + senhaEncoder);
			} else {
				System.out.println("Senha ERRO: " + senhaEncoder);
			}
			
		};
	}
	
	
}
