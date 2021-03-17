package com.wzp.springboot.config;
import com.wzp.springboot.servlet.UserServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean =new ServletRegistrationBean(new UserServlet(),"myservlet");
        return  servletRegistrationBean;
    }
}
