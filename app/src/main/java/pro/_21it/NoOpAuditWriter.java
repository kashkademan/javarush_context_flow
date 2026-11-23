package pro._21it;

// "Пустая" реализация: аудит как концепция есть, но конкретно здесь ничего не делаем
public class NoOpAuditWriter implements AuditWriter {
    @Override
    public void write(String message) {
        // молча игнорируем — удобно для тихого режима и будущих тестов
        // важно: бизнес-сервис всё равно вызывает аудит, но инфраструктура выбрана "нулевая"
    }
}
