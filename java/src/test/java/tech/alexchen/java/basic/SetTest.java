package tech.alexchen.java.basic;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author alexchen
 */
public class SetTest {

    @Test
    void contains() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        for (Integer integer : set) {
            
        }


        Iterator<Integer> iterator = set.iterator();
        if (iterator.hasNext()) {
            
        }
    }
}
