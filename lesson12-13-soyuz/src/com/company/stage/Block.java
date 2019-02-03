package com.company.stage;

import com.company.engine.IEngine;

import java.util.Objects;

/**
 * Блок из которых состоит ступень
 */
public class Block {
    // Двигатель установленный в блоке
    private IEngine engine;
    // Имя блока
    private String name;

    // Конструктор с параметрами
    // принимает объект любой двигатель соответствующий интерфейсу IEngine и имя блока
    public Block(IEngine engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    // Блок гетторов/сетторов
    public IEngine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    // переопределение метода сравнения объекта (проверка эквивалентности)
    // (нужен для использования в Collection)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(name, block.name);
    }

    // переопределение метода расчета хеш кода для объекта (нужен для использования в Collection)
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // переопределяем метод для преобразования объекта в строковое представление
    // используем для логирования состояния в консоле
    @Override
    public String toString() {
        return "Block{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                '}';
    }
}
