package tech.alexchen.daydayup.designpattern.behavioural.chain.filter;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class URLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("Before URLFilter");
        chain.doFilter(request, response);
        System.out.println("After URLFilter");
    }
}
