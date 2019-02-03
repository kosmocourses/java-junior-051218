package com.company.emulator;

import com.company.Emulator;

/**
 * Контекст игры - специальный объект который хранит текущий статус
 * важных для игрового мира объектов и переменных
 */
public class GameContext {
    // Ссылка на движок эмулятор
    private Emulator emulator;
    // Команда для следующего шага эмуляции
    private Command cmd;


    // Блок геттеров/сетторов
    public Emulator getEmulator() {
        return emulator;
    }

    public void setEmulator(Emulator emulator) {
        this.emulator = emulator;
    }

    public Command getCmd() {
        return cmd;
    }

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }

    // переопределяем метод для преобразования объекта в строковое представление
    // используем для логирования состояния в консоле
    @Override
    public String toString() {
        return "GameContext{" +
                "emulator=" + emulator +
                ", cmd=" + cmd +
                '}';
    }
}
