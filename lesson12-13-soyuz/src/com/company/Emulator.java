package com.company;

import com.company.emulator.Command;
import com.company.emulator.GameContext;
import com.company.emulator.ILifeCycle;
import com.company.emulator.World;

import java.util.Scanner;

/**
 * Класс описывает объект используемы как "движок игрового мира"
 */
public class Emulator {

    // Признак(еще говорят "флаг") что исполнение игрового цикла разрешено
    private static boolean isRunning = true;
    // Команда для следующей итерации
    private static Command cmd;
    // Объект чтения консоли, используем для получения команд от пользователя
    private Scanner sc = new Scanner(System.in);

    // Сеттер для управления игровым циклом из вне
    public void setIsRunning(boolean isRunning) {
        Emulator.isRunning = isRunning;
    }


    //FIXME: ДЗ: Перенесите класс Emulator в пакет com.company.emulator
    // вынесите метод main() в класс Launcher
    public static void main(String[] args) throws Exception {
        //new Emulator().runGameLoop();
        Emulator emu = new Emulator(); // создаем эмулятор
        emu.runGameLoop(); // запускаем его игровой цикл на исполнение
    }

    /**
     * Методзапуска игрового цикла
     * @throws Exception предупреждаем что можем "выкинуть ошибку"
     */
    private void runGameLoop() throws Exception {
        // Создаем и инициализируем(настраиваем) мир
        ILifeCycle world = new World();
        // Создаем контекст игры и настраиваем его
        GameContext ctx = new GameContext();
        ctx.setEmulator(this); // передаем ссылку на себя (ведь сейчас мы в исполняемся в коде объекта Emulator)
        ctx.setCmd(Command.UNDEFINED); // команнда для первой итерации цикла

        // Запускаем игру
        while (isRunning){ // проверяем что игровому циклу можно работать
            // код игрового цикла
            world.update(ctx); // обновляем мир (а мир должен передать эту команду всем содержащимся в нем объектам)
            ctx.setCmd(getNextCmd()); // получаем следующую команду и запоминаем её
            Thread.sleep(500); // засыпем на 500 мс
        }

        // Разрушаем мир
        world.destroy();
    }

    /**
     * Получаем команду от пользователя
     * @return Command команда для следующей итерации игрового цикла
     */
    private Command getNextCmd() {
        System.out.print("Enter command: "); // печать приглашения
        String rawCmd = sc.next(); // чтение команды из консоли
        System.out.println(); // перевод строки
        switch (rawCmd){ // парсим команду (определяем что за команда)
            case "старт": return Command.START;
            case "отмена": return Command.CANCEL;
            //FIXME: добавить парсинг команды телеметрия
            default: return Command.UNDEFINED;
        }
    }
}
