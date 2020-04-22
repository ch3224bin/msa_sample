package com.example.auth.user.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name = "oauth_client_details")
@Getter
public class OauthClientDetails {
	@Id
	private String clientId;
	private String resourceIds;
	private String clientSecret;
	private String scope;
	private String authorizedGrantTypes;
	private String webServerRedirectUri;
	private String authorities;
	private int accessTokenValidity;
	private int refreshTokenValidity;
	private String additionalInformation;
	private String autoapprove;
}
