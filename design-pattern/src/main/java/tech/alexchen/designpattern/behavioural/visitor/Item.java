package tech.alexchen.designpattern.behavioural.visitor;

import lombok.Data;

/**
 * @author alexchen
 * @date 2023/3/5
 */
@Data
public class Item implements Element {

    private String info;

    public Item(String info) {
        this.info = info;
    }

    @Override
    public void accept(Visitor visitor) {
        // 访问自己
        visitor.visit(this);
    }
}
