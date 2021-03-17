package com.wzp.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(urlPatterns = "/myFilter")
public class Myfilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {



        System.out.println("进入过滤器");
  filterChain.doFilter(servletRequest,servletResponse);
    }
}
