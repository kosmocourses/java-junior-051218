package org.kosmocourses.junior.lesson10.interfaces;

/**
 * Интерфей описавающе поведение объектов способных к перемещению в пространстве
 */
public interface IMove {
    /**
     * Переместиться вперед
     */
    void moveTo();

    /**
     * Переместиться влево
     */
    void moveToLeft();

    /**
     * Переместиться направо
     */
    void moveToRight();

    /**
     * Переместиться назад
     */
    void moveToBack();
}
