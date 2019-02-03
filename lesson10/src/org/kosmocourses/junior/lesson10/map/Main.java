package org.kosmocourses.junior.lesson10.map;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Map - структура "ключ - значение"
        // HashMap - ключ вычисляется на основании hashcode
        // порядок выдачи не гарантирован
        Map<Integer, String> emulatorArrayList = new HashMap<>(); // создаем Map
        emulatorArrayList.put(0, "Строка1"); // добавляем значение "Строка1" по ключу hashcode(0)
        emulatorArrayList.put(1, "Строка2");
        emulatorArrayList.put(2, "Строка3");
        emulatorArrayList.put(3, "Строка4");
        emulatorArrayList.put(4, "Строка5");
        emulatorArrayList.putIfAbsent(1, "String#6"); // добавляем если такого кляча еще нет

        for(int i = 0; i < 5; i++){ // перебераем по индексу (тут мы жестко завязались что у нас только 5 значений
            System.out.println(emulatorArrayList.get(i)); // получаем значение по ключу
        }

        Set<Integer> keys = emulatorArrayList.keySet(); // получаем набор ключей
        for(Integer key: keys){ // итерируемся по набору ключей с помощью for-each
            System.out.println(emulatorArrayList.get(key)); // получаем значение по ключу
        }

        // получаем набор элементов "ключ - значение"
        // итерируемся по набору с помощью for-each
        for(Map.Entry entry: emulatorArrayList.entrySet()){
            // печатаем ключ и значение
            System.out.println("key =" + entry.getKey() + " value =" + entry.getValue());
        }

        Collection<String> values =  emulatorArrayList.values(); // получаем набор значений
        for(String value: values){ // итерируемся по набору с помощью for-each
            System.out.println(value); // печатаем значения
        }

        // Создаем упорядоченную Map, порядок выдачи гарантирован на основе сортировки
        // для сортировки используется красночерное дерево
        TreeMap<String, String> emails = new TreeMap<>();
        emails.put("alex", "u01@mail.ru"); // добавляем значение "u01@mail.ru" по ключу "alex"
        emails.put("tom", "u02@mail.ru");
        emails.put("bob", "u03@mail.ru");
        emails.put("alice", "u04@mail.ru");
        emails.put("tim", "u04@mail.ru");

        // получаем набор элементов "ключ - значение"
        // итерируемся по набору с помощью for-each
        for(Map.Entry<String, String> entry: emails.entrySet()){
            System.out.println(String.format("user=%s email=%s", entry.getKey(), entry.getValue()));
        }

        // Map - структура "ключ - значение"
        // LinkedHashSet - ключ вычисляется на основании hashcode, а также сохраняется порядок добавления
        // порядок выдачи гарантирован на основе порядка добавления
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("s1");
        strings.add("s2");
        strings.add("s3");
        // итерируемся по набору с помощью for-each
        for (String str: strings){
            System.out.println(str);
        }

        strings.add("s1");
        // итерируемся по набору с помощью for-each
        for (String str: strings){
            System.out.println(str);
        }
    }
}
