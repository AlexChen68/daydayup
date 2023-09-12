package tech.alexchen.daydayup.designpattern.behavioural.chain.filter;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public interface Filter {

    void doFilter(Request request,Response response,FilterChain chain);
}
