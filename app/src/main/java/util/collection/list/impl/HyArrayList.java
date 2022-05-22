package util.collection.list.impl;

import com.google.common.collect.ImmutableList;
import jdk.nashorn.internal.ir.annotations.Immutable;
import util.collection.HyIterator;
import util.collection.list.HyImmutableList;
import util.collection.list.HyMutableList;

class HyArrayList<E> implements HyImmutableList<E>, HyMutableList<E> {
    private static final int DEFAULT_SIZE = 32;
    private final Object[] elementData;

    public HyArrayList(){
        this.elementData = new Object[DEFAULT_SIZE];
    }

    public HyArrayList(int size){
        if (size == 0){
            throw new IllegalArgumentException("size can not be 0");
        }
        this.elementData = new Object[size];
    }

    public HyArrayList(E... elements){
        if (elements.length == 0){
            throw new IllegalArgumentException("elementData can not be 0");
        }
        this.elementData = new Object[DEFAULT_SIZE];
        for(E element:elements){
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

}
