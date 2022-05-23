package util.collection.list;

import util.collection.HyMutableCollection;
import util.collection.HyMutableIterator;

public interface HyMutableList<E> extends HyMutableCollection<E>, HyReadOnlyList<E> {
    @Override
    E get(int index);

    @Override
    E add(E data);

    E remove(E data);

    HyMutableIterator<E> getIterator();
}
