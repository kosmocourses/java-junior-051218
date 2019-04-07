package org.kosmocourses.junior.lesson17.bank;

/**
 * Created by Vladislav Gasanov on 13.02.2019.
 */
public class Account {
    private double money; // <- BigDecimal

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
