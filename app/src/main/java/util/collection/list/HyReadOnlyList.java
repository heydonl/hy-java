package util.collection.list;

import util.collection.HyReadOnlyCollection;
import util.collection.HyReadOnlyIterator;

public interface HyReadOnlyList<E> extends HyReadOnlyCollection<E> {
    E get(int index);

    @Override
    HyReadOnlyIterator<E> getIterator();
}
