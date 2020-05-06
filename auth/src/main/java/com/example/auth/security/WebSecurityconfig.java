package com.example.auth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.auth.user.service.UserInfomationService;

@EnableWebSecurity
public class WebSecurityconfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserInfomationService userInfomationService;
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.antMatcher("/**")
				.authorizeRequests()
			.antMatchers("/login").permitAll()
			.anyRequest()
				.authenticated()
				.and()
			.httpBasic();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder.userDetailsService(userInfomationService);
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// authenticationManage 빈 등록, 등록해줘야 됨...
		return super.authenticationManagerBean();
	}
}
