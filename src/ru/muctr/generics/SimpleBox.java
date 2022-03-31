package ru.muctr.generics;

/**
 * @author Evgenia Skichko
 */
public class SimpleBox {
    private Object obj;

    public SimpleBox(Object obj) {
        this.obj = obj;
    }

    public SimpleBox() {
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
