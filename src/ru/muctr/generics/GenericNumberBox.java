package ru.muctr.generics;

/**
 * @author Evgenia Skichko
 */
public class GenericNumberBox<T extends Number> {
    private T obj;

    public GenericNumberBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
