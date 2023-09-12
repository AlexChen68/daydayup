package tech.alexchen.daydayup.spring.core.propertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import tech.alexchen.daydayup.spring.core.propertyeditor.entity.Person;

/**
 * @author alexchen
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Person.class, new PersonEditor());
    }
}
