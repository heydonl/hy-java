package util.collection.list.impl;

import util.collection.HyReadOnlyIterator;
import util.collection.list.HyReadOnlyList;

public class HyReadOnlyArrayList<E> implements HyReadOnlyList<E> {

    private final HyReadOnlyList<E> hyReadOnlyList;

    public HyReadOnlyArrayList(int size) {
        this.hyReadOnlyList = new HyMutableArrayList<>(size);
    }

    public HyReadOnlyArrayList(E... elementData) {
        this.hyReadOnlyList = new HyMutableArrayList<>(elementData);
    }

    public HyReadOnlyArrayList(HyReadOnlyList hyReadOnlyList) {
        this.hyReadOnlyList = hyReadOnlyList;
    }

    @Override
    public E get(int index) {
        return hyReadOnlyList.get(index);
    }

    @Override
    public HyReadOnlyIterator<E> getIterator() {
        return hyReadOnlyList.getIterator();
    }
}
