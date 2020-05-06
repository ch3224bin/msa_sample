package com.example.post.client.config;

import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;

public class UserServiceClientRequestConfiguration {
	@Bean
    public RequestInterceptor barApiRequestHeader() {
        return new BearerAuthRequestInterceptor();
    }
}
