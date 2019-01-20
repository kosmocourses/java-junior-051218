package org.kosmocourses.junior;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private static String mark = "Volvo";

    static {
        System.out.println("Run static class block");
    }

    private String regNumber = "к555кк55";
    private String color;

    public static void printMark(){
        System.out.println("Mark = " + mark);
    }

    public String getMark(){
        return mark;
    }

    public void setMark(String newmark){
        mark = newmark;
    }

    public Car(String color) {
        this.color = color;
        System.out.println("Run constructor block");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRed(){
//        Arrays.fill();

        return "RED".equals(color.toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }
}
