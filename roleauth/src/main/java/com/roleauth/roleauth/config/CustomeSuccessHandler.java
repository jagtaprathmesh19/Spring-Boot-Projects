package com.roleauth.roleauth.config;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
public class CustomeSuccessHandler implements AuthenticationSuccessHandler {

	public CustomeSuccessHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		var authorites = authentication.getAuthorities();
		var roles = authorites.stream().map(r -> r.getAuthority()).findFirst();

		if (roles.orElse("").equals("ADMIN")) {
			response.sendRedirect("/user/admin");
		} else if (roles.orElse("").equals("USER")) {
			response.sendRedirect("/user/user");
		} else if (roles.orElse("").equals("STUDENT")) {
			response.sendRedirect("/user/student");
		} else if (roles.orElse("").equals("TEACHER")) {
			response.sendRedirect("/user/teacher");
		} else {
			response.sendRedirect("/extra");
		}
	}

}
