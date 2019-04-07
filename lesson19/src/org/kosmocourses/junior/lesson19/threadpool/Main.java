package org.kosmocourses.junior.lesson19.threadpool;

import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * Created by Vladislav Gasanov on 20.02.2019.
 */
public class Main {

    public static void main(String[] args) {

        Executor executor = Executors.newSingleThreadExecutor();

        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(11);
            }
        });


        ExecutorService service1 = Executors.newFixedThreadPool(2);

        Future<String> result = service1.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "WWW";
            }
        });

//

        try {
            String msg = result.get(1, TimeUnit.SECONDS);
            System.out.println(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        //service1.invokeAll()

        service1.shutdown(); //FIXME не останавливаются
//        service1.shutdownNow();
//
        try {
            service1.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ExecutorService service2 = Executors.newCachedThreadPool();

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
    }

}
