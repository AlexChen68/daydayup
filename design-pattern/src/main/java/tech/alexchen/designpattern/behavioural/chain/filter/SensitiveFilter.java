package tech.alexchen.designpattern.behavioural.chain.filter;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("Before SensitiveFilter");
        chain.doFilter(request, response);
        System.out.println("After SensitiveFilter");
    }
}
