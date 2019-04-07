package org.kosmocourses.junior.lesson17;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vladislav Gasanov on 13.02.2019.
 */
public class Printer  implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println("THREAD-3:Hi!");
            if (i >= 13) {
                break;
            }
            i++;
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
