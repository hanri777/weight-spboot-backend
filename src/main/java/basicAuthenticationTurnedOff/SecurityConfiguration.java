//package com.anri.weight.contr.app.weightcontrspbootapp.config;
//
//import com.anri.weight.contr.app.weightcontrspbootapp.service.CustomUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.cors.CorsConfiguration;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
////@EnableJpaRepositories(basePackageClasses = UserRepository.class)
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private CustomUserDetailsService customUserDetailsService;
//
//    //For custom user
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserDetailsService).passwordEncoder(encodePWD());
//    }
//
//    @Bean
//    public BCryptPasswordEncoder encodePWD() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/signup").permitAll()
//                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//                //.antMatchers("/admin-admin").authenticated()
//                //.antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
//                //.antMatchers("/").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
        //--------------

//        http.csrf().disable();
//        http.authorizeRequests()
//                //@PreAuthorize("hasRole('ADMIN')") in controller
//                .antMatchers("/admin-admin").authenticated()
//                //.hasRole("ADMIN")
//                .antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/").permitAll()
//                .and()
//                    .formLogin()
//                   // .loginPage("http://localhost:4200/sign-in")
//                    .usernameParameter("email")
//                    .permitAll()
//                .and()
//                    .logout()
//				    .permitAll();

 //       http.csrf().disable();
//        http.authorizeRequests()
//          .antMatchers("/rest/**").authenticated()
//          .anyRequest().permitAll();
//          .and()
//          .authorizeRequests()
//          .antMatchers("/secure/**").authenticated()
//          .anyRequest().hasAnyRole("ADMIN")
//          .and()
//          .formLogin().permitAll();
    //}



//        http.authorizeRequests()
//                // URLs matching for access rights
//                .antMatchers("/").permitAll()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/register").permitAll()
//                .antMatchers("/home/**").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
//                .anyRequest().authenticated()
//                .and()
//                // form login
//                .csrf().disable().formLogin()
//                .loginPage("/login") //custom login page
//                .failureUrl("/login?error=true")
//                .defaultSuccessUrl("/home")
//                .usernameParameter("email")
//                .passwordParameter("password")
//                .and()
//                // logout
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/").and()
//                .exceptionHandling()
//                .accessDeniedPage("/access-denied");

//    http
//            .authorizeRequests()
//            .antMatchers("/", "/home").permitAll()
//				.anyRequest().authenticated()
//				.and()
//			.formLogin()
//				.loginPage("/login")
//				.permitAll()


     //}
