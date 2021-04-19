package br.com.websterjunior.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	/**
	 * @param senha
	 * @return
	 */
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}

		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}

	/**
	 * @param senha
	 * @param senhaEncoder
	 * @return
	 */
	public static boolean validaSenha(String senha, String senhaEncoder) {
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoder);
	}

}
