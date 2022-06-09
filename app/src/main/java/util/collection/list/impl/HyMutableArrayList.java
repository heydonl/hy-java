package util.collection.list.impl;

import util.collection.HyMutableIterator;
import util.collection.HyReadOnlyCollection;
import util.collection.HyReadOnlyIterator;
import util.collection.list.HyMutableList;

import java.util.concurrent.atomic.AtomicInteger;

public class HyMutableArrayList<E> implements HyMutableList<E> {
    private static final int DEFAULT_SIZE = 32;
    private final Object[] elements;
    private AtomicInteger index = new AtomicInteger(-1);

    public HyMutableArrayList() {
        this.elements = new Object[DEFAULT_SIZE];
    }

    public HyMutableArrayList(int size) {
        if (size == 0) {
            throw new IllegalArgumentException("size can not be 0");
        }
        this.elements = new Object[size];
    }

    public HyMutableArrayList(E... elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("element data size can not be 0");
        }
        this.elements = new Object[DEFAULT_SIZE];
        for (E element : elements) {
            add(element);
        }
    }

    public HyMutableArrayList(HyReadOnlyCollection<E> hyReadOnlyCollection){
        HyReadOnlyIterator<E> hyReadOnlyIterator = hyReadOnlyCollection.getIterator();
        this.elements = new Object[DEFAULT_SIZE];
        while (hyReadOnlyIterator.hasNext()){
            E element = hyReadOnlyIterator.getNext();
            elements[index.incrementAndGet()] = element;
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
