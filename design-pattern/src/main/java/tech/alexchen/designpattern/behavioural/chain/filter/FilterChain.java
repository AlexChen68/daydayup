package tech.alexchen.designpattern.behavioural.chain.filter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * FilterChain 也实现了 Filter，可以让不同的 FilterChain 连接在一起
 *
 * @author alexchen
 * @date 2023/3/5
 */
public class FilterChain {

    private List<Filter> filters = new CopyOnWriteArrayList();
    private int index = 0;

    public FilterChain() {}

    public FilterChain add(Filter filter) {
        if (filter == null) {
            throw new RuntimeException("Filter invalid");
        }
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index >= filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
