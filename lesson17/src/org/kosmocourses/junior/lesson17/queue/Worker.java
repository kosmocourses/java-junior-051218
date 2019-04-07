package org.kosmocourses.junior.lesson17.queue;

/**
 * Created by Vladislav Gasanov on 16.02.2019.
 */
public class Worker extends Thread {
    private Queue q;

    public Worker(String name, Queue q) {
        super(name);
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            String task = q.getTask();
            System.out.println(Thread.currentThread().getName() + " : " + task);
        }
    }
}
