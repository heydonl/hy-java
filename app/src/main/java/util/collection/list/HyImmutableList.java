package util.collection.list;

import util.collection.HyImmutableCollection;
import util.collection.HyImmutableIterator;
import util.collection.HyReadOnlyCollection;

public interface HyImmutableList<E> extends HyImmutableCollection<E> {
    HyImmutableList<E> add(E element);
    void remove(int index);
    HyImmutableIterator<E> getIterator();
}
