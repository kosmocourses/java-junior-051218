package org.kosmocourses.junior.lesson7;

public class Application {

    final double PI;

    public Application(double value) {
        PI = value;
    }

    static {
        System.out.println("Ой вей!");
    }

    public static void main(String[] args) {

	    final String WELCOME = "Hello people!";

	    Application application1 = new Application(Math.PI);
	    Application application2 = new Application(3.14);

        System.out.println(application1.calculate(4));

        System.out.println(application2.calculate(4));

    }

    public double calculate(final double radiusOfCircleRedColor){
        return PI *radiusOfCircleRedColor*radiusOfCircleRedColor;
    }
}
