package ru.kosmocorses.junior.lesson11.animals;

/**
 * Абстрактный класс описывающий всех животных
 */
public abstract class Animal {
    // имя животного
    private String name;
    // тип животного
    private EnumOfAnimals type;

    // абстрактный метод, т.е. мы знаем что все наши животные могут как-то есть,
    // но не знаем как конкретно. Такой метод будет полиморфный.
    abstract public void eat();

    // блок гетторов/сетторов
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumOfAnimals getType() {
        return type;
    }

    public void setType(EnumOfAnimals type) {
        this.type = type;
    }

    // в зависимости от типа мы пишем как наши животные издают звуки
    // так мы можем не прибегать к полиморфным методам,
    // но придеться писать больше кода и очень сложно поддерживать,
    // надо будет не забывать менять если количество типов измениться
    public String sound() {
        switch (type) {
            case CAT:
                return "Myau!";
            case DOG:
                return "Gav!";
            case ELEPHANT:
                return "UUUUUUUUUUU!";
            default:
                return "";
        }
    }
}
