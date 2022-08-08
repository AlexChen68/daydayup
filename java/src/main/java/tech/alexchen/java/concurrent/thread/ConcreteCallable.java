package tech.alexchen.java.concurrent.thread;

import cn.hutool.core.util.StrUtil;

import java.util.concurrent.Callable;

/**
 * @author alexchen
 * @date 2022/7/31
 */
public class ConcreteCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println(StrUtil.format("{}:{}", Thread.currentThread().getName(), Thread.currentThread().getId()));
        return "callback value";
    }

}
