package com.example2.demo2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * 夏辰义
 * 2026/8/2015:24
 */
@Configuration
//@Configuration：告诉 Spring "这个类不是普通类，是配置类"，Spring 启动时会扫描并加载里面的配置。
public class SecurityConfig {

    //把密码加密器交给Spring
    @Bean
    //把方法的返回值交给 Spring 容器管理（单例），其他类用 @Autowired 就能注入使用
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }//Spring Security 推荐的密码加密工具，基于 BCrypt 算法

    //放行所有请求
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                //先关闭 CSRF（这是浏览器表单防伪造攻击的保护，我们做的是 API，先关掉方便测试）
                .csrf(csrf ->csrf.disable())
                //所有请求都不必要登陆
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        return http.build();
    }
}
