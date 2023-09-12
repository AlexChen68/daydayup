package tech.alexchen.daydayup.java.concurrent.thread;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author alexchen
 * @date 2022/7/31
 */
@Slf4j
public class ConcreteRunnable implements Runnable {

    @Override
    public void run() {
        log.info("{} - {}", Thread.currentThread().getName(), Thread.currentThread().getId());
    }
}
