package com.company.rocket;

import com.company.stage.Stage;

/**
 * Описывает поведение всех ракет
 */
public interface IRocket {

    /**
     * Обработчик команды на запуск ракеты
     */
    void start();

    /**
     * Обработчик команды на отмену запуска
     */
    void cancel();

    /**
     * Обработчик команды на расстыковку ступени
     * @param stage ступень которую надо отстыковать
     */
    void unDocking(Stage stage);

    /**
     * Обработчик команды пристыковать ступень
     * @param stage ступень которую надо пристыковать
     */
    void addStage(Stage stage);
}
