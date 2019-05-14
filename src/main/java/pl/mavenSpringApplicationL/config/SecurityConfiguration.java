package pl.mavenSpringApplicationL.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity  //!!!
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder amb) throws Exception{
          //for one user
        /*
            amb.inMemoryAuthentication()
                .withUser("sylwia")
                .password("sylwia")
                .roles("USER","ADMIN");
        */

        InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder> imudmc = amb.inMemoryAuthentication();
        imudmc
            .withUser("sylwia")
            .password("sylwia")
            .roles("USER","ADMIN");

        imudmc
            .withUser("sylwia2")
            .password("sylwia2")
            .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("/").permitAll()
                //.antMatchers("/db").authenticated()
                .and().formLogin();
    }
}
