package tech.alexchen.daydayup.designpattern.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author alexchen
 * @date 2023/3/3
 */
@Getter
@AllArgsConstructor
public enum ConnectionType {

    JDBC_CONNECTION("jdbc:mysql:"),
    LOADBALANCE_CONNECTION("jdbc:mysql:loadbalance:");
    String prefix;

}
