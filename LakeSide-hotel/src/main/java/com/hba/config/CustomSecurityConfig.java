package com.hba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class CustomSecurityConfig {

	@Bean
	public SecurityFilterChain getsecurity(HttpSecurity http) throws Exception {

		return http.csrf(c -> c.disable())
				.authorizeHttpRequests(re -> re.requestMatchers("rooms/add/new-room").permitAll())
				.formLogin(f -> f.disable()).build();
	}
}
