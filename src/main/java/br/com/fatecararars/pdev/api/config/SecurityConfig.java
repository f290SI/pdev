package br.com.fatecararars.pdev.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    private static final String[] PUBLIC_RESOURCES = {
        "/h2-console/**"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        .antMatchers(PUBLIC_RESOURCES).permitAll()
        .anyRequest().authenticated()
        .and().httpBasic()
        .and().csrf().disable();
        
        http.headers().frameOptions().disable();
    }
    

}
