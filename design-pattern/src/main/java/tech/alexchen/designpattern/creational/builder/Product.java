package tech.alexchen.designpattern.creational.builder;

import lombok.Data;

/**
 * Product（产品角色）：<br/>
 * 它是被构建的复杂对象，包含多个组成部件，具体建造者创建该产品的内部表示并定义它的装配过程。
 *
 * @author AlexChen
 * @date 2022-05-01 03:55
 */
@Data
public class Product {

    private String partA;

    private String partB;

    private String partC;

}
