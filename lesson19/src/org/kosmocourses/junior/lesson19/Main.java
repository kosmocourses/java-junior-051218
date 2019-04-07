package org.kosmocourses.junior.lesson19;

public class Main {

    public static void main(String[] args) {

        Request request1 = new Request();
        Request request2 = new Request();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":" + request1.getUserId());
                request1.setUserId(1);
                System.out.println(Thread.currentThread().getName() + ":" + request1.getUserId());

                while (true) {
                    try {
                        request1.setClientPort(60134);
                        Thread.currentThread().sleep(500);
                        System.out.println(Thread.currentThread().getName() + ":" + request1.getClientPort());
                        System.out.println(Thread.currentThread().getName() + ":" + request1.isDDOS());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":" + request2.getUserId());
                request2.setUserId(2);
                System.out.println(Thread.currentThread().getName() + ":" + request2.getUserId());

                while (true) {
                    try {
                        request2.setClientPort(60007);
                        Thread.currentThread().sleep(250);
                        System.out.println(Thread.currentThread().getName() + ":" + request2.getClientPort());
                        System.out.println(Thread.currentThread().getName() + ":" + request2.isDDOS());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        Thread analizator = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(1500);
                    request2.setDDOS(true);
                    System.out.println(Thread.currentThread().getName() + ":" + request2.isDDOS());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        analizator.start();

    }
}
