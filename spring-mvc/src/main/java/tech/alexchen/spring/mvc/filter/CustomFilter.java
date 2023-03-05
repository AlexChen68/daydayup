package tech.alexchen.spring.mvc.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
