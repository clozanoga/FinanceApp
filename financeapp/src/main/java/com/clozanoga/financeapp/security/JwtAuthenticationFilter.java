package com.clozanoga.financeapp.security;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.clozanoga.financeapp.domain.User;
import com.clozanoga.financeapp.manager.impl.CustomUserDetailsServiceImpl;

import static com.clozanoga.financeapp.constants.SecurityConstants.HEADER_STRING;
import static com.clozanoga.financeapp.constants.SecurityConstants.TOKEN_PREFIX;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private JwtTokenProvider tokenProvider;
	
	@Autowired
	private CustomUserDetailsServiceImpl customUserDetailsServiceImpl;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
				
		try {
			String jwt = getJWTFromRequest(request);
			
			if (!StringUtils.isEmpty(jwt) && tokenProvider.validateToken(jwt)) {
				Long userId = tokenProvider.getUserIdFromJWT(jwt);
				User userDetails = customUserDetailsServiceImpl.loadUserById(userId);
				
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, Collections.emptyList());				
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
			
		} catch (Exception ex) {
			logger.error("Could not set user authentication in security context", ex);
		}
		
		filterChain.doFilter(request, response);
	}
	
	private String getJWTFromRequest(HttpServletRequest request) {
		String bearerToken = request.getHeader(HEADER_STRING);
		
		if (!StringUtils.isEmpty(bearerToken) && bearerToken.startsWith(TOKEN_PREFIX)) {
			return bearerToken.substring(7, bearerToken.length());
		}
		
		return null;
	}

}
