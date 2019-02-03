package ru.kosmocorses.junior.lesson11.animals;

/**
 * Типы наших животных
 */
public enum EnumOfAnimals {
    CAT("Cat"),  // кошка (в скобках её строковое представление)
    DOG("Dog"),  // собака
    ELEPHANT("Elephant"); //слон

    // стороковое представление
    private String value;

    // конструктор с параметром, принимает строковое представление
    EnumOfAnimals(String value) {
        this.value = value;
    }

    // переопределяем метод получения строкового представления объекта
    @Override
    public String toString() {
        return value;
    }
}
