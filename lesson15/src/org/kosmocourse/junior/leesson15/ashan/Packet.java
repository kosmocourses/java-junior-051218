package org.kosmocourse.junior.leesson15.ashan;

import org.kosmocourse.junior.leesson15.ashan.product.Food;

public class Packet<T extends Food, E> extends AbstractBox<T>{ // T, E, K, V
    T product;
    E conutry;

    public T getProduct() {
        return getEntity();
    }

    public void setProduct(T product) {
        this.putEntity(product);
    }

    public E getConutry() {
        return conutry;
    }

    public void setConutry(E conutry) {
        this.conutry = conutry;
    }

    @Override
    void putEntity(T entity) {
        this.product = entity;
    }

    @Override
    T getEntity() {
        return product;
    }

//    public <X extends AbstractBox> void printer(X box){
//        System.out.println(box);
//        System.out.println(box.getEntity());
//    }
}
