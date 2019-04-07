package org.kosmocourses.junior.lesson17.queue;

/**
 * Created by Vladislav Gasanov on 16.02.2019.
 */
public class App {
    public static void main(String[] args) {

        Queue q = new Queue();

        WebServer webServer = new WebServer("server",q);
        Worker worker1 = new Worker("worker-1",q );
        Worker worker2 = new Worker("worker-2",q );

        webServer.start();
        worker1.start();
        worker2.start();
    }
}
