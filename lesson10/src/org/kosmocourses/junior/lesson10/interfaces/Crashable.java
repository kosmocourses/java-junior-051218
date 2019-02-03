package org.kosmocourses.junior.lesson10.interfaces;

/**
 * Описываем поведение объектов способных к разрушению
 */
public interface Crashable {

    /**
     * проверка разрушился ли объект
     *
     * @return boolean True если разрушился успешно
     */
    boolean isCrash();
}
