package org.kosmocourses.junior.lesson6;

public class Main {
    // java -jar myapp.jar param1 param2 -> args[0]= myapp.jar, args[1]=param1, ...
    // java Main.class param1 param2 -> args[0]= Main.class, args[1]=param1, ...
    public static void main(String[] args) {
//        printMsg("Method with one parameter");
//        printMsg("Method with two parameters", "param2");
        printMsg(12121211,"system#1","Method with four parameters", "param2", "param3", "param4");

//        String[] msg = {"Method with four parameters", "param2", "param3", "param4"};
//        printMsg(msg);
    }

    public static void printMsg(int timespamp, String prefix, String... msg){
        for (String str: msg) {
            System.out.println(timespamp + ": " + prefix + ": " + str);
        }
    }

//    public static void printMsg(String[] mgs){
//
//    }

    public static void printMsg(String msg1, String msg2) {
        System.out.println(msg1 + "+" + msg2);
    }

    public static void printMsg(String msg){
        System.out.println(msg);
    }
}
