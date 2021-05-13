package com.regino.coursework6.config.security.controller;

import com.regino.coursework6.config.security.exceptions.JwtAuthenticationException;
import com.regino.coursework6.config.security.jwt.JwtTokenProvider;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@AllArgsConstructor
public class JwtTokenFilter extends GenericFilterBean {

    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("request filtering");
        try {
            jwtTokenProvider.resolveToken((HttpServletRequest) servletRequest)
                    .filter(jwtTokenProvider::validateToken)
                    .map(jwtTokenProvider::getAuthentication)
                    .ifPresent(SecurityContextHolder.getContext()::setAuthentication);
        } catch (JwtAuthenticationException e) {
            SecurityContextHolder.clearContext();
            ((HttpServletResponse) servletResponse).sendError(e.getHttpStatus().value());
            logger.info("unauthorised request");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}