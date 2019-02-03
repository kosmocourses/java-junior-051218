package org.kosmocourses.junior.lesson14;

/**
 * Создаем свой собственный класс ошибок
 */
public class MyException extends Exception {

    /**
     * Конструктор принимающий сообщение.
     * Сообщение обычно зависит от контекста и содержит описание проблемы
     * @param message сообщение
     */
    public MyException(String message) {
        super(message);
    }

    /**
     * Конструктор принимающий сообщение и первоначально возникшую ошибку.
     * Применяется для связывания ошибок как бы "по цепочке"
     * @param message сообщение
     * @param cause первоначальная ошибка
     */
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
