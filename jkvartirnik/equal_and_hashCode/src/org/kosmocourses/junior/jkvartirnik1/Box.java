package org.kosmocourses.junior.jkvartirnik1;

import java.util.Date;

/**
 * Created by Vladislav Gasanov on 03.04.2019.
 */
public class Box {

    private int height;
    private int width;
    private Date date;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (height != box.height) return false;
        return width == box.width;

    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + width;
        return result;
    }
}
