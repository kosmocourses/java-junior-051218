package org.kosmocourses.junior.lesson17.bank;

/**
 * Created by Vladislav Gasanov on 13.02.2019.
 */
public class Task1 implements Runnable {

    @Override
    public void run() {
        ABS.transferMoney(
                ABS.getAcc1(),
                ABS.getAcc2(),
                200_000
        );
    }
}
