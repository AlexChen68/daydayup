package tech.alexchen.java.concurrent.thread;

import cn.hutool.core.util.StrUtil;

/**
 * 自定义线程方式一：
 * 继承 {@link Thread}，重写 {@link Thread#run()} 方法
 *
 * @author alexchen
 * @date 2022/7/31
 */
public class ConcreteThread extends Thread {

    @Override
    public void run() {
        System.out.println(StrUtil.format("{}:{}", Thread.currentThread().getName(), Thread.currentThread().getId()));
    }

}
