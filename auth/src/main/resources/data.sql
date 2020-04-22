insert into oauth_client_details (client_id, client_secret, resource_ids, scope, authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, refresh_token_validity, additional_information, autoapprove)
values ('auth_id', '{noop}auth_secret', null, 'read,write', 'authorization_code,password,client_credentials,implicit,refresh_token', null, 'ROLE_MY_CLIENT', 36000, 2592000, null, null);

insert into T_USER (username, password, user_type, date)
values ('user', '{bcrypt}$2a$10$0PWBBSnEyV9G4jCTT.wTGu7H9ugBFlWPGe/9jRwYmEXfxfILQ8l9q', 0, CURRENT_TIMESTAMP());
