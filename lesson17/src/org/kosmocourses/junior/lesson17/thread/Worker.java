package org.kosmocourses.junior.lesson17.thread;

import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vladislav Gasanov on 16.02.2019.
 */

public class Worker extends Thread {

    @Override
    public void run() {
        int i = 0;
        while(!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println(Thread.currentThread().getName() + " : " + i++);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread worker1 = new Worker();
        worker1.setName("WORKER-1");
        worker1.start();

//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        worker1.suspend();
//        System.out.println("suspend");
//
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        worker1.resume();
//        System.out.println("resume");
//
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        worker1.stop();
//        System.out.println("stop");
//
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        worker1.interrupt();
    }
}
