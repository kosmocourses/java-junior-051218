package org.kosmocourse.junior.leesson15.nested;

public class Main {
    public static void main(String[] args) {
        // 1)
//        Server.Request request = new Server.Request();
//
//        // 2)
//        Server server = new Server();
//        //Server.User user = server.new Server.User();

        // 4)
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("I robot!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
    }
}
