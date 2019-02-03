package com.company.stage;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Ступень ракетоносителя
 */
public class Stage {
    // номер ступени
    private int number;
    // тип ступени, например ускоритель
    private StageType type;
    // набор блоков входящий в ступень
    private Set<Block> blocks = new HashSet<>();

    // Конструктор с параметрами
    // принимает номер ступени и её тип
    public Stage(int number, StageType type) {
        this.number = number;
        this.type = type;
    }

    // Блок гетторов/сетторов
    public int getNumber() {
        return number;
    }

    public StageType getType() {
        return type;
    }

    public Set<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(Set<Block> blocks) {
        this.blocks = blocks;
    }

    public void addBlocks(Block block){
        this.blocks.add(block);
    }

    // переопределение метода сравнения объекта (проверка эквивалентности)
    // (нужен для использования в Collection)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stage stage = (Stage) o;
        return number == stage.number;
    }

    // переопределение метода расчета хеш кода для объекта (нужен для использования в Collection)
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    // переопределяем метод для преобразования объекта в строковое представление
    // используем для логирования состояния в консоле
    @Override
    public String toString() {
        return "Stage{" +
                "number=" + number +
                ", type=" + type +
                ", blocks=" + blocks +
                '}';
    }
}
