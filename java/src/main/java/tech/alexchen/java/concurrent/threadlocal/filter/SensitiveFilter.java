package tech.alexchen.java.concurrent.threadlocal.filter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author alexchen
 * @date 2023/3/5
 */
@Slf4j
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        log.info("Before SensitiveFilter");
        chain.doFilter(request, response);
        log.info("After SensitiveFilter");
    }
}
