package org.vizzoid.inthelight;

@SuppressWarnings("unchecked")
public class Latice<T> {

    private final int width;
    private final int size;
    private Object[] latice;

    public Latice(int width) {
        this.width = width;
        this.size = width * width;
        this.latice = new Object[size];
    }

    public void clear() {
        latice = new Object[size];
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public T get(int x, int y) {
        return get(toIndex(x, y));
    }

    public T get(int index) {
        return (T) latice[index];
    }

    public void set(int x, int y, T t) {
        set(toIndex(x, y), t);
    }

    public void set(int index, T t) {
        latice[index] = t;
    }

    public int toIndex(int x, int y) {
        return (y * width) + x;
    }

}
