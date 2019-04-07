package org.kosmocourses.junior.lesson17.queue;

/**
 * Created by Vladislav Gasanov on 16.02.2019.
 */
public class WebServer extends Thread {

    private Queue q;

    public WebServer(String name, Queue q) {
        super(name);
        this.q = q;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            String task = "bzhjfsw  = " + i++;
            q.addTask(task);
            System.out.println(Thread.currentThread().getName() + " : " + task);
        }
    }
}
