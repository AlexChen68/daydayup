package tech.alexchen.daydayup.designpattern.behavioural.chain.filter;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class Client {

    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        Request request = new Request();
        Response response = new Response();
        filterChain.doFilter(request, response);
    }
}
