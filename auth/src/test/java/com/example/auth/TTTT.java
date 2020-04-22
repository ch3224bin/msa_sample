package com.example.auth;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

public class TTTT {

	@Test
	public void test() {
		System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("1234"));
	}
}
