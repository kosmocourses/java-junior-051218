package org.kosmocourses.junior.lesson17.bank;

/**
 * Created by Vladislav Gasanov on 13.02.2019.
 */
public class FoxMan extends Thread{

    private static Account account;

    public void getMoney(double money){
        synchronized (account) {
            if (account.getMoney() >= money) {
                System.out.println(Thread.currentThread().getName() + " : " + account);
                account.setMoney(account.getMoney() - money);
                System.out.println(Thread.currentThread().getName() + " : " + account);
            } else {
                System.out.println(Thread.currentThread().getName() + " : " + account);
                System.out.println(Thread.currentThread().getName() + " : no money!");
            }
        }
    }

    @Override
    public void run() {
        getMoney(100_000);
    }

    public static void main(String[] args) {
        account = new Account();
        account.setMoney(100_000);

//        Task1 bankomat1 = new Task1();
//        Task1 bankomat2 = new Task1();
//
//        bankomat1.setAccount(account);
//        bankomat2.setAccount(account);


        Thread foxman1 = new FoxMan();
        Thread foxman2 = new FoxMan();

        foxman1.start();
        foxman2.start();
    }
}
