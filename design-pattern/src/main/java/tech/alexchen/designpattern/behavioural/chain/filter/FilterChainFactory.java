package tech.alexchen.designpattern.behavioural.chain.filter;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public class FilterChainFactory {

    public static FilterChain createFilterChain() {
        FilterChain chain = new FilterChain();
        chain.add(new URLFilter());
        chain.add(new SensitiveFilter());
        return chain;
    }
}
