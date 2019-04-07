package org.kosmocourses.junior.lesson17.bank;

/**
 * Created by Vladislav Gasanov on 13.02.2019.
 */
public class Task2 implements Runnable {

    @Override
    public void run() {
        ABS.transferMoney(
                ABS.getAcc2(),
                ABS.getAcc1(),
                100_000
        );
    }
}
