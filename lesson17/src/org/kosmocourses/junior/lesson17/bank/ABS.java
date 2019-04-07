package org.kosmocourses.junior.lesson17.bank;

/**
 * Created by Vladislav Gasanov on 16.02.2019.
 */
public class ABS {

    private static Account acc1;
    private static Account acc2;
    private static Account acc3;

    static {
        acc1 = new Account();
        acc2 = new Account();
        acc3 = new Account();
        acc1.setMoney(300_000);
        acc2.setMoney(100_000);
        acc3.setMoney(200_000);
    }

    public static Account getAcc1() {
        return acc1;
    }

    public static Account getAcc2() {
        return acc2;
    }

    public static Account getAcc3() {
        return acc3;
    }

    public static void transferMoney(Account fromAcc, Account toAcc, double money){

        // synchronized (this) { ... }
        // synchronized (ABS.class) { ... }

        synchronized (fromAcc) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (toAcc) {
                double currentMoneyOfFromAcc = fromAcc.getMoney();
                double currentMoneyOfToAcc = toAcc.getMoney();
                if (currentMoneyOfFromAcc >= money) {
                    fromAcc.setMoney(currentMoneyOfFromAcc - money);
                    toAcc.setMoney(currentMoneyOfToAcc + money);
                    System.out.println("Transfer :" + money + " from " + fromAcc + " to " + toAcc);
                }
            }
        }
    }

}
