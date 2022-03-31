package ru.muctr.generics;

/**
 * @author Evgenia Skichko
 */
public class GenericBox<T> {
    private T obj;

    public GenericBox(T obj) {
        this.obj = obj;
    }

    public GenericBox() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
