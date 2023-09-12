package tech.alexchen.daydayup.java.concurrent.thread;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @author alexchen
 * @date 2022/7/31
 */
@Slf4j
public class ConcreteCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        log.info("{} - {}", Thread.currentThread().getName(), Thread.currentThread().getId());
        return "callback value";
    }
}
