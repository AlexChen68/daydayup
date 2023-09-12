package tech.alexchen.daydayup.designpattern.creational.singleton;

/**
 * 转载自：<a href="https://pdai.tech/md/dev-spec/pattern/2_singleton.html">创建型 - 单例模式(Singleton pattern)</a><br/>
 * <p>
 * 双重校验锁:<br/>
 * <p>
 * uniqueInstance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行，
 * 只有当 uniqueInstance 没有被实例化时，才需要进行加锁。 双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。<br/>
 * <p>
 * 只使用了一个 if 语句。在 uniqueInstance == null 的情况下，如果两个线程同时执行 if 语句，那么两个线程就会同时进入 if 语句块内，
 * 虽然在 if 语句块内有加锁操作，但是两个线程都会执行 uniqueInstance = new Singleton(); 这条语句，只是先后的问题，
 * 那么就会进行两次实例化，从而产生了两个实例。因此必须使用双重校验锁，也就是需要使用两个 if 语句。<br/>
 * <p>
 * 为什么 uniqueInstance 采用 volatile 关键字：<br/>
 * 对于 uniqueInstance = new Singleton3() 这段代码，其执行分为三步：<br/>
 * 1、分配内存空间<br/>
 * 2、初始化对象<br/>
 * 3、将 uniqueInstance 指向分配的内存地址<br/>
 * <p>
 * 由于 JVM 具有指令重排的特性，有可能执行顺序变为了 1>3>2，这在单线程情况下自然是没有问题。
 * 但如果是多线程下，有可能获得是一个还没有被初始化的实例，以致于程序出错。 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
 *
 * @author AlexChen
 * @date 2022-06-06 06:54
 */
public class Singleton3 {

    private volatile static Singleton3 uniqueInstance;

    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
