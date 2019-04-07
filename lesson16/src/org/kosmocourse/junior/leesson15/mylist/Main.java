package org.kosmocourse.junior.leesson15.mylist;

public class Main {
    public static void main(String[] args) {
        Integer[] conteiner = new Integer[10];
        MyList<Integer> myList = new MyList<>(conteiner);

        String[] container2 = new String[10];
        MyList<String> myList2 = new MyList<>(container2);

        for(int i = 0; i < 10; i++){
            myList.add(i+1);
        }

        myList2.add("CNN");

    }
}
