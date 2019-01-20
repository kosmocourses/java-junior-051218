package org.kosmocourses.junior.lesson6.decomposition;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name + "@" + getClass().getName();
    }

    public void setName(String name) {
        this.name = name;
    }
}
