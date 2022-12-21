package tech.alexchen.spring.core.propertyeditor;

import org.springframework.beans.propertyeditors.URLEditor;

import java.beans.PropertyEditor;
import java.net.URL;

/**
 * @author alexchen
 */
public class Client {

    public static void main(String[] args) {
        PropertyEditor editor = new URLEditor();
        editor.setAsText("https://www.baidu.com");
        Object value = editor.getValue();
        if (value instanceof URL) {
            URL url = (URL) value;
            System.out.println(url.toExternalForm());
            System.out.println(editor.getAsText());
        } else {
            System.out.println("转换失败");
        }
    }
}
