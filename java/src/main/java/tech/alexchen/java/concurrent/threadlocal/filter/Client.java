package tech.alexchen.java.concurrent.threadlocal.filter;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author alexchen
 * @date 2023/3/5
 */
@Slf4j
public class Client {

    static class Task implements Callable<Response> {
        @Override
        public Response call() throws Exception {
            FilterChain filterChain = FilterChainFactory.getSingletonFilterChain();
            Request request = new Request();
            Response response = new Response();
            filterChain.doFilter(request, response);
            return response;
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        };
        ExecutorService executor = new ThreadPoolExecutor(5, 5,
                6000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(1024), threadFactory);
        List<Future<Response>> res = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Future<Response> submit = executor.submit(new Task());
            res.add(submit);
        }
        for (Future<Response> future : res) {
            log.info(future.get().toString());
        }
    }
}
