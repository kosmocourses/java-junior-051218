package org.kosmocourses.junior.lesson10;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Map<Integer, String> emulatorArrayList = new HashMap<>();
//        emulatorArrayList.put(0, "Строка1");
//        emulatorArrayList.put(1, "Строка2");
//        emulatorArrayList.put(2, "Строка3");
//        emulatorArrayList.put(3, "Строка4");
//        emulatorArrayList.put(4, "Строка5");
//        emulatorArrayList.putIfAbsent(1, "String#6");
//
//        for(int i = 0; i < 5; i++){
//            System.out.println(emulatorArrayList.get(i));
//        }
//
//        Set<Integer> keys = emulatorArrayList.keySet();
//        for(Integer key: keys){
//            System.out.println(emulatorArrayList.get(key));
//        }
//
//        for(Map.Entry entry: emulatorArrayList.entrySet()){
//            System.out.println("key =" + entry.getKey() + " value =" + entry.getValue());
//        }
//
//        Collection<String> values =  emulatorArrayList.values();
//        for(String value: values){
//            System.out.println(value);
//        }

        TreeMap<String, String> emails = new TreeMap<>();
        emails.put("alex", "u01@mail.ru");
        emails.put("tom", "u02@mail.ru");
        emails.put("bob", "u03@mail.ru");
        emails.put("alice", "u04@mail.ru");
        emails.put("tim", "u04@mail.ru");

        for(Map.Entry<String, String> entry: emails.entrySet()){
            System.out.println(String.format("user=%s email=%s", entry.getKey(), entry.getValue()));
        }


        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("s1");
        strings.add("s2");
        strings.add("s3");
        for (String str: strings){
            System.out.println(str);
        }

        strings.add("s1");
        for (String str: strings){
            System.out.println(str);
        }
    }
}
