package org.kosmocourses.junior.lesson17;

public class Main extends Thread{

    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println("Поток:" + Thread.currentThread().getName() + " : " + ++i); // i = i + 1
            if (i >= 10) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
	// write your code here
//        while(true){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        Thread thread1 = new Main();
        thread1.setName("Поток№2");
        thread1.setPriority(9);
        thread1.start();

        Thread thread3 = new Thread(new Printer());
        thread3.start();

        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("MySuperProgram");
        System.out.println(thread);

//        while(true){
//            try {
//                if (!thread1.isAlive() && !thread3.isAlive()) {
//                    System.out.println("All thread was dead! :(");
//                    break;
//                }
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        thread1.join();
        thread3.join();
        System.out.println("All thread was dead! :(");

//        new Thread(new Printer()); // BAD STYLE
    }
}
