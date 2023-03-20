package tech.alexchen.java.concurrent.threadlocal.filter;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class FilterChainFactory {

    private static FilterChain filterChain;

    public static FilterChain getSingletonFilterChain() {
        if (filterChain == null) {
            synchronized (FilterChainFactory.class) {
                if (filterChain == null) {
                    filterChain = createFilterChain();
                }
                return filterChain;
            }
        } else {
            return filterChain;
        }
    }
    public static FilterChain createFilterChain() {
        FilterChain chain = new FilterChain();
        chain.add(new UrlFilter());
        chain.add(new SensitiveFilter());
        return chain;
    }
}
