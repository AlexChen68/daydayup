package tech.alexchen.daydayup.java.hutool;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author alexchen
 */
public class IDUtilDemo {

    public static void main(String[] args) {
        Snowflake snowflake = IdUtil.getSnowflake();
        snowflake.nextId();
    }
}
