package tech.alexchen.designpattern.behavioural.visitor;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexchen
 * @date 2023/3/5
 */
@Data
public class Order implements Element {

    private List<Item> items;
    private String info;

    public Order(String info) {
        this.info = info;
        this.items = new ArrayList<>();
    }

    public Order(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    @Override
    public void accept(Visitor visitor) {
        // 先访问自己
        visitor.visit(this);
        // 嵌套的每个元素也都接待来访者
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}
