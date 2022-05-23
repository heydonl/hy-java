package util.collection.list.impl;

import util.collection.HyMutableIterator;
import util.collection.list.HyMutableList;

public class HyMutableArrayList<E> implements HyMutableList<E> {
    private static final int DEFAULT_SIZE = 32;
    private final Object[] elementData;

    public HyMutableArrayList() {
        this.elementData = new Object[DEFAULT_SIZE];
    }

    public HyMutableArrayList(int size) {
        if (size == 0) {
            throw new IllegalArgumentException("size can not be 0");
        }
        this.elementData = new Object[size];
    }

    public HyMutableArrayList(E... elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("element data size can not be 0");
        }
        this.elementData = new Object[DEFAULT_SIZE];
        for (E element : elements) {
            add(element);
        }
    }

    @Override
    public E get(int index) {

        return null;
    }

    @Override
    public E add(E data) {
        return null;
    }

    @Override
    public E remove(E data) {
        return null;
    }

    @Override
    public HyMutableIterator<E> getIterator() {
        return null;
    }
}
