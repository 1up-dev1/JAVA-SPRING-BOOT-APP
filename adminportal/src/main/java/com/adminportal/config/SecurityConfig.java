package com.adminportal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	

	private static final String[] PUBLIC_MATCHERS = {
			"/css/**",
			"/js/**",
			"/image/**",
			"/newUser",
			
			"/",
			"/home",
			"/patient",
			"/patient/add",
			"/patient/patientList",
			"/patient/patientInfo",
			"/patient/updatePatient",
			"/patient/remove",
			"/patient/removeList",
			
			"/fonts/**"
			
	};

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests().
		
			antMatchers(PUBLIC_MATCHERS).
			permitAll().anyRequest().authenticated();

		 
	}
            
           

}
