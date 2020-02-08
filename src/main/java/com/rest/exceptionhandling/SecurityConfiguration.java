package com.rest.exceptionhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.zalando.problem.spring.web.advice.security.SecurityProblemSupport;

@Configuration
@EnableWebSecurity
@Import(SecurityProblemSupport.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private SecurityProblemSupport problemSupport;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf()
				.disable()
			.authorizeRequests()
				.antMatchers("/users").permitAll()
				.and()
		.exceptionHandling()
			.accessDeniedHandler(problemSupport)
			.authenticationEntryPoint(problemSupport);
	}
	
	

}
