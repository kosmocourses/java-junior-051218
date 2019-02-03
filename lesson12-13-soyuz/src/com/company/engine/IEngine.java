package com.company.engine;

/**
 * Интерфейс описывающий поведение всех ракетных двигателей
 */
public interface IEngine {
    /**
     * Запуск двигателя
     */
    void start();

    /**
     * Остановка двигателя
     */
    void stop();

    /**
     * Получаем статус двигателя
     * @return boolean True если запущен
     */
    boolean isStarted();
}
