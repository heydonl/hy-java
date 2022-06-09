package util.collection.list.impl;

import util.collection.HyImmutableCollection;
import util.collection.HyImmutableIterator;
import util.collection.HyReadOnlyCollection;
import util.collection.HyReadOnlyIterator;
import util.collection.list.HyImmutableList;
import util.common.NumberUtil;

import java.util.concurrent.atomic.AtomicInteger;

public class HyImmutableArrayList<E> implements HyImmutableList<E> {
    private Object[] elements;
    private AtomicInteger index = new AtomicInteger(-1);

    public HyImmutableArrayList(int size){
        if (!NumberUtil.greaterThanZero(size)){
            throw new RuntimeException("size must be greater than zero");
        }
        elements = new Object[size];
    }

    public HyImmutableArrayList(E... elements){

    }

    public HyImmutableArrayList(HyReadOnlyCollection<E> hyReadOnlyCollection){
       HyReadOnlyIterator<E> hyReadOnlyIterator = hyReadOnlyCollection.getIterator();
       while (hyReadOnlyIterator.hasNext()){
          E element = hyReadOnlyIterator.getNext();
          elements[index.incrementAndGet()] = element;
       }
    }


    @Override
    public HyImmutableList<E> add(E element) {
        HyMutableArrayList hyMutableArrayList = new HyMutableArrayList(this);
        hyMutableArrayList.add(element);
        return new HyImmutableArrayList<>(hyMutableArrayList);
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public HyImmutableIterator<E> getIterator() {
        return null;
    }

    private class HyImmutableArrayListIterator<E> implements HyImmutableIterator<E>{

        private AtomicInteger currentIndex = new AtomicInteger(-1);
        @Override
        public boolean hasNext() {
            if (currentIndex.get() + 1 <= HyImmutableArrayList.this.index.get()){
                currentIndex.incrementAndGet();
                return true;
            }else{
                return false;
            }
        }

        @Override
        public E getNext() {
            return (E) HyImmutableArrayList.this.elements[currentIndex.get()];
        }

        @Override
        public void remove() {

        }
    }
}
