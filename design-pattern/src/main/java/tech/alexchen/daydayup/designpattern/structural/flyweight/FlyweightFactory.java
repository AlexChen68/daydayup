package tech.alexchen.daydayup.designpattern.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author alexchen
 * @date 2023/3/4
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> flyweights = new ConcurrentHashMap<>();

    public static Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }
}
