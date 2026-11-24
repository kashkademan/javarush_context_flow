package pro._21it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Говорим Spring: это конфигурационный класс, его нужно обработать при старте контекста
public class AppConfig {
    // Пока пусто: здесь появятся @Bean-методы с описанием того, что и как создавать в контейнере
    @Bean // Этот метод будет вызван контейнером для создания управляемого объекта (bean)
    public String appName() {
        // Возвращаем значение, которое будет лежать в контейнере как bean типа String
        return "ContextFlow";
    }
}
