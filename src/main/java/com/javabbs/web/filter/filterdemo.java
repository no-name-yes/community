package com.javabbs.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("")
public class filterdemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //放行前处理req里的数据


        //放行
        filterChain.doFilter(servletRequest,servletResponse);

        //放行后处理
    }

    @Override
    public void destroy() {

    }
}
