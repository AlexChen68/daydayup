package tech.alexchen.daydayup.spring.core.propertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author alexchen
 */
@Configuration
public class EditorConfig {

//    @Bean
//    public CustomEditorConfigurer customEditorConfigurer() {
//        CustomEditorConfigurer configurer = new CustomEditorConfigurer();
//        Map<Class<?>, Class<? extends PropertyEditor>> editors = new HashMap<>();
//        editors.put(Person.class, PersonEditor.class);
//        configurer.setCustomEditors(editors);
//        return configurer;
//    }

    @Bean
    public CustomPropertyEditorRegistrar customPropertyEditorRegistrar() {
        return new CustomPropertyEditorRegistrar();
    }

    @Bean
    public CustomEditorConfigurer customEditorConfigurer() {
        CustomEditorConfigurer configurer = new CustomEditorConfigurer();
        configurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{customPropertyEditorRegistrar()});
        return configurer;
    }
}
