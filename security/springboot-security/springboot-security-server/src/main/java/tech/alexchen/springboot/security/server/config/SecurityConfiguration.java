package tech.alexchen.springboot.security.server.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import tech.alexchen.springboot.security.server.handler.ExpiredSessionHandler;
import tech.alexchen.springboot.security.server.handler.MyAuthenticationProvider;

import java.io.PrintWriter;
import java.util.Collections;

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * @author alexchen
 * @date 2023/2/25
 */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration {

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        // 使用 BCrypt 加密密码
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public MyAuthenticationProvider myAuthenticationProvider() {
//        MyAuthenticationProvider myAuthenticationProvider = new MyAuthenticationProvider();
//        myAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//        myAuthenticationProvider.setUserDetailsService(userDetailsService());
//        return myAuthenticationProvider;
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager() throws Exception {
//        return new ProviderManager(Collections.singletonList(myAuthenticationProvider()));
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
////        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        // roles 和 authorities 不要同时设置，后面会覆盖前面的!!!
//        UserDetails admin = User
//                .withUsername("admin")
//                .password(passwordEncoder().encode("123456"))
//                .roles("ADMIN")
//                .build();
//        UserDetails alex = User.withUsername("alex")
//                .password(passwordEncoder().encode("123456"))
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(admin, alex);
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.authorizeRequests().anyRequest().authenticated().and()
//                .oauth2Login(withDefaults())
//                .build();
//    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.authorizeHttpRequests((authorize) -> authorize
//                        .antMatchers("/captcha").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin((formLogin) -> formLogin
//                        .successHandler((req, resp, auth) -> {
//                            resp.setContentType("application/json;charset=utf-8");
//                            PrintWriter out = resp.getWriter();
//                            out.write(new ObjectMapper().writeValueAsString(auth.getPrincipal()));
//                            out.flush();
//                            out.close();
//                        })
//                        .failureHandler((req, resp, e) -> {
//                            resp.setContentType("application/json;charset=utf-8");
//                            PrintWriter out = resp.getWriter();
//                            out.write(new ObjectMapper().writeValueAsString(e.getMessage()));
//                            out.flush();
//                            out.close();
//                        })
//
//                )
//                .sessionManagement((s) -> s
//                        .maximumSessions(1)
//                        .maxSessionsPreventsLogin(false)
//                        .expiredSessionStrategy(new ExpiredSessionHandler())
//                )
//                .cors().disable()
//                .csrf().disable()
//                .build();
//    }

//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring()
//                .antMatchers("/css/**");
//    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.authorizeHttpRequests((authorize) -> authorize
//                        .antMatchers("/hello").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin((formLogin) -> formLogin
//                        .successForwardUrl("/login/success")
//                )
//                .sessionManagement((s) -> s
//                        .maximumSessions(1)
//                        .maxSessionsPreventsLogin(false)
//                        .expiredSessionStrategy(new ExpiredSessionHandler())
//                )
//                .csrf().disable()
//                .build();
//    }

}
