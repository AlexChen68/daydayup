package tech.alexchen.java.concurrent.thread;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 自定义线程方式一：
 * 继承 {@link Thread}，重写 {@link Thread#run()} 方法
 *
 * @author alexchen
 * @date 2022/7/31
 */
@Slf4j
public class ConcreteThread extends Thread {

    public ConcreteThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        log.info("{} - {}", Thread.currentThread().getName(), Thread.currentThread().getId());
    }

}
