package org.kosmocourses.junior.lesson9;

import java.awt.*;
import java.util.Objects;

public class Dog implements Comparable<Dog> {
    private String name;
    private Color color;

    public Dog(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return color != null ? color.equals(dog.color) : dog.color == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public int compareTo(Dog dog) {
        return (this.name.charAt(0) < dog.name.charAt(0)) ? -1 : ((this.name.charAt(0) == dog.name.charAt(0)) ? 0 : 1);
    }
}
