package org.kosmocourses.junior.lesson6.decomposition;

public class Director extends Employee {

    private int offer;

    public Director(String name) {
        super(name); // super()
    }

    @Override
    public String getName() {
        return super.name + "D" + getClass().getName(); // super.*
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }
}
