package util.collection.list;

import util.collection.HyMutableCollection;
import util.collection.HyMutableIterator;

public interface HyMutableList<E> extends HyMutableCollection<E>{
    E get(int index);
    HyMutableList<E> add(E data);
    HyMutableList<E> remove(E data);
    HyMutableIterator<E> getIterator();
}
