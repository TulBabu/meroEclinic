/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroeclinic.web.auth.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Babu TUl
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            .antMatchers("/","/**").permitAll()
//            .antMatchers("/static/**").permitAll()
//            .antMatchers("/admin/**").denyAll()
            .anyRequest()
            .authenticated()
            .and()
            .formLogin().loginPage("/login").permitAll()
            .and().logout().invalidateHttpSession(true)
            .permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
    //for static content like bootstrap css access
    web.ignoring().antMatchers("/webjars/**","/static/**");
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder encoder=getPasswordEncoder();
        auth.inMemoryAuthentication()
                .passwordEncoder(encoder)
                .withUser("admin")
                .password(encoder.encode("admin12"))
                .authorities("ROLE_ADMIN");
    }
     @Bean
     public BCryptPasswordEncoder getPasswordEncoder(){
         return new BCryptPasswordEncoder();
     }
}
