package tech.alexchen.daydayup.designpattern.behavioural.visitor;

/**
 * @author alexchen
 * @date 2023/3/5
 */
public interface Element {
    // 要求元素可以接待来访者
    void accept(Visitor visitor);
}
