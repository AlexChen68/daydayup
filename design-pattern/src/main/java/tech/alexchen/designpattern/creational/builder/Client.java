package tech.alexchen.designpattern.creational.builder;

/**
 * 客户端:<br/>
 * 对于客户端而言，只需关心具体的建造者即可，可以通过配置文件来存储具体建造者类ConcreteBuilder的类名，
 * 使得更换新的建造者时无须修改源代码，系统扩展更为方便。
 *
 * @author AlexChen
 * @date 2022-06-07 21:24
 */
public class Client {

    public static void main(String[] args) {
        //确定构建者，而无需关心构造过程
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();

        //自由构造
        Product anotherProduct = builder.buildProcessA()
                .buildProcessB().build();
    }

}
