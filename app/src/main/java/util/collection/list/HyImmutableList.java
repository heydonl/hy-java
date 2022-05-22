package util.collection.list;

import util.collection.HyImmutableCollection;
import util.collection.HyImmutableIterator;
import util.collection.HyIterator;

public interface HyImmutableList<E> extends HyImmutableCollection<E> {
    E get(int index);
    HyImmutableIterator<E> getIterator();
}
