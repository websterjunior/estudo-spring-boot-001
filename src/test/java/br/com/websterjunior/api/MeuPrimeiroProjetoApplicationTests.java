package br.com.websterjunior.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.websterjunior.api.utils.SenhaUtils;

@SpringBootTest
@ActiveProfiles("test")
class MeuPrimeiroProjetoApplicationTests {

	@Value("${nome.aplicacao}")
	private String nomeAplicacao;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCarregarValorProperties() {
		assertEquals("TESTE", nomeAplicacao);
	}

	@Test
	public void testaSenha() {
		String senha = "MinhaSenha12345";
		String senhaEncoder = SenhaUtils.gerarBCrypt(senha);
		assertEquals(SenhaUtils.validaSenha(senha, senhaEncoder), true);
	}

}
