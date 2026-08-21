package com.example2.demo2.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 夏辰义
 * 2026/8/2121:24
 */


@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final LoginInterceptor loginInterceptor;

    public WebConfig(LoginInterceptor loginInterceptor) {
        this.loginInterceptor = loginInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")                    // 拦截所有
                .excludePathPatterns(                      // 排除以下（不用登录就能访问）
                        "/users/login",                        // 登录接口
                        "/users/register",                     // 注册接口
                        "/swagger-ui/**",                      // Swagger 页面
                        "/swagger-ui.html",                    // Swagger 首页（有些版本是这个）
                        "/v3/api-docs/**",                     // Swagger API 数据
                        "/error"                               // Spring 错误页
                );
    }
}