package org.kosmocourse.junior.leesson15.ashan.employee;

import org.kosmocourse.junior.leesson15.ashan.AbstractBox;
import org.kosmocourse.junior.leesson15.ashan.Product;

/**
 * Интерфейс показывает что может делать кассир
 */
public interface ICassir {

    // кассир может взять продукт у покупателя
    void getProduct(Product product);

    // кассир может назвать покупателю цену продукта
    double showPrice();

    // кассир может взять деньги у покупателя для оплаты
    double getMoney();
}
