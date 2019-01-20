package org.kosmocourses.junior;

public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("Red");
        System.out.println(car1.getMark());
        car1.setMark("LADA");

        Car car2 = new Car("Blue");
        System.out.println(car2.getMark());















//        String[] gifts = {"Fly", "Bird", "Car"};

        //;

//        for (int i = 0, j = gifts.length-1; i < gifts.length; i++, j--) {
//            System.out.println(gifts[j]);
//        }
//
//        for (String gift : gifts){
//            System.out.println(gift);
//        }

//        do {
//            System.out.println(gifts[i]);
//            i++;
//        } while (i < gifts.length);

//        while (true){
//            if ("Bird".equals(gifts[i])) {
//                i++;
//                continue;
//            }
//            System.out.println(gifts[i]);
//            i++;
//            if (i >= gifts.length) {
//                break;
//            }
//        }

//        Object gift1 = new Car("Red");
//        Object gift2 = new Car("Red");
//
//        if (gift1 != null && gift1.equals(gift2)) {
//            System.out.println("Вам надо 300000$ на подарок");
//        } else {
//            System.out.println("Вам надо 600000$ на подарки");
//        }

//        boolean isFly = "Fly".equals(gift)?true:false;

//        if ("Car".equals(gift) && isFly) {
//            gift += ", keys";
//        } else if ("Computer".equals(gift)) {
//            gift += ", game";
//        } else {
//            gift += ", card";
//        }

//        switch (gift) {
//            case "Bird": //if ("Bird".equals(gift) || "Dog".equals(gift))
//                break;
//            case "Dog":
//                gift += ", food";
//                break;
//
//            case "Car":
//                gift += ", key";
//                break;
//
//            default:
//                gift += ", ho-ho-ho!";
//        }

//        System.out.println(String.format("The your gift is: %s", gift));
//        System.out.println(isFly);
//        System.out.println("Fly".equals(gift)?"the gift can fly":"the gift can not fly!");

    }
}
