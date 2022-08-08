package tech.alexchen.java.concurrent.thread;

import cn.hutool.core.util.StrUtil;

/**
 * @author alexchen
 * @date 2022/7/31
 */
public class ConcreteRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(StrUtil.format("{}:{}", Thread.currentThread().getName(), Thread.currentThread().getId()));
    }
}
