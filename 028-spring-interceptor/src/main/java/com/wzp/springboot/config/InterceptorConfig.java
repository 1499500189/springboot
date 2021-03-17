package com.wzp.springboot.config;

import com.wzp.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*配置类，相当于xml配置文件*/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String[] addPathPatterns = {};

   registry.addInterceptor(new UserInterceptor()).addPathPatterns("/user/**").excludePathPatterns("/user/out","/user/error","user/login");

    }
}
