package tech.alexchen.daydayup.designpattern.creational.prototype;

import java.io.Serializable;

/**
 * 原型对象的属性对象
 *
 * @author AlexChen
 * @date 2022-06-07 06:27
 */
public class PrototypeInfo implements Serializable {

    int number;

    String string;

    public PrototypeInfo(int number, String string) {
        this.number = number;
        this.string = string;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "PrototypeInfo{" +
                "number=" + number +
                ", string='" + string + '\'' +
                '}';
    }
}
