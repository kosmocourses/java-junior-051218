package org.kosmocourses.junior.lesson6.decomposition;

public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name + "E" + getClass().getName();
    }
}
