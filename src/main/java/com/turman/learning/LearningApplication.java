package com.turman.learning;

import com.turman.learning.component.interceptor.LoginInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@MapperScan("com.turman.learning.mapper")   //扫描mapper
@SpringBootApplication
public class LearningApplication implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor)
//                .addPathPatterns("/**")    //对哪些路径生效
//                .excludePathPatterns("/loginUser","/login.html","/css/**","/js/**");  //对哪些路径不生效
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class, args);
    }

}
