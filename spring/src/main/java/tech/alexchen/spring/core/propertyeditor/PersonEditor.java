package tech.alexchen.spring.core.propertyeditor;

import cn.hutool.json.JSONUtil;
import tech.alexchen.spring.core.propertyeditor.entity.Person;

import java.beans.PropertyEditorSupport;

/**
 * @author alexchen
 */
public class PersonEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Person person = JSONUtil.toBean(text, Person.class);
        setValue(person);
    }

    @Override
    public String getAsText() {
        Person person = (Person) getValue();
        return person != null ? person.toString() : "";
    }
}
