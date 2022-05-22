package util.collection.list;

import util.collection.HyIterator;
import util.collection.HyMutableCollection;
import util.collection.HyMutableIterator;

public interface HyMutableList<E> extends HyMutableCollection<E> {
    E get(int index);
    E add(E data);
    E remove(E data);
    HyMutableIterator<E> getIterator();
}
