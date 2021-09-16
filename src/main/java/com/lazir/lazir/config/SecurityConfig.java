package com.lazir.lazir.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration  //xml설정
@EnableWebSecurity  //시큐리티설정을 직접 함
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().
        mvcMatchers("/","/login","/sign-up","/check-email","/check-email-token",
        "/email-login","/check-email-login","/login-link").permitAll()  //인증없이 허용
        .mvcMatchers(HttpMethod.GET, "/profile/*").permitAll()  //get요청일때만 허용
        .anyRequest().authenticated();      //나머지는 인증 필요
        
    }
}