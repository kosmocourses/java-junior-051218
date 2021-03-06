package org.kosmocourse.junior.leesson15.ashan;

import org.kosmocourse.junior.leesson15.ashan.gadgets.Gadget;

public class BubbleBox<T extends Crashable> extends AbstractBox<T> {
    private T entity;

    @Override
    void putEntity(T entity) {
        this.entity = entity;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.putEntity(entity);
    }
}
