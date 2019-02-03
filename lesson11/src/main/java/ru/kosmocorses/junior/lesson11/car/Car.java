package ru.kosmocorses.junior.lesson11.car;

/**
 * Машина которая может перемещаться в пространстве
 */
public abstract class Car implements IMove {
    // текущая позиция на оси ОХ
    private double x;
    // двигатель машины
    protected IEngine engine;

    // конструктор в параметром, принимающий координату машины на оси ОХ
    public Car(double x) {
        this.x = x;
    }

    // блок гетторов/сетторов
    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    // имплементируем (пишем реализацию) метода из интерфейса IMove
    public void moveTo() {
        x++;    // перемещаемся на 1 точку вперед
        System.out.println(x);
    }

    // методы которые не реализованы из интерфейсов становятся абстрактными для класса
    // поэтому класс надо указать тоже абстрактным, а сами такие методы не писать.
    // так мы и поступили для метода run() из интерфейса IEngine
    // abstract public void run();
}
