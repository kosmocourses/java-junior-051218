package ru.kosmocorses.junior.lesson11.animals;

public class Main{
    public static void main(String[] args) {
        Animal animal = new Cat();          // создаем кошку
        animal.setName("Murka");            // с именем "Мурка"
        animal.setType(EnumOfAnimals.CAT);  // указываем что тип животного - кошка
        animal.eat();                       // просим кошку поесть, а как кушать она сама знает

        System.out.println(animal.sound());     // просим кошку мяукнуть
        System.out.println(animal.getType());   // смотрим тип животного
    }
}
