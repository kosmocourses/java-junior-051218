package com.company.engine;

/**
 * Описываем общие для всех двигателей методы.
 * Класс делаем абстрактным, чтобы не было желания создать экземпляр какого-то обобщенного двигателя
 */
public abstract class AbstractEngine implements IEngine {
    // Состояние двигателя, запущени или нет.
    private boolean isStarted;
    // Наименовае двигателя
    protected String name;
    // Количество рулевых сопел
    protected int drivers;

    // В конструкторе по умочанию мы настраиваем двигал выключенным при создании
    public AbstractEngine() {
        this.isStarted = false;
    }

    // Имплементируем метод из интерфейса IEngine для старта двигателя
    @Override
    public void start() {
        this.isStarted = true;
        System.out.println(getClass().getSimpleName() + " engine was started");
    }

    // Имплементируем метод из интерфейса IEngine для остановки двигателя
    @Override
    public void stop() {
        this.isStarted = false;
        System.out.println(getClass().getSimpleName() + " engine was stopped");
    }

    // Имплементируем метод из интерфейса IEngine для получения статуса двигателя
    @Override
    public boolean isStarted() {
        return isStarted;
    }

    // Блок геттеров
    public String getName() {
        return name;
    }

    public int getNumbOfDrivers() {
        return drivers;
    }

    // переопределяем метод для преобразования объекта в строковое представление
    // используем для логирования состояния в консоле
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "isStarted=" + isStarted +
                ", name='" + name + '\'' +
                ", drivers=" + drivers +
                '}';
    }
}
