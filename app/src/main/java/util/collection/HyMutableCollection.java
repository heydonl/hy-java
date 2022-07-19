package util.collection;

public interface HyMutableCollection<E> extends HyCollection<E> {
    HyMutableCollection<E> add(E element);

    HyMutableCollection<E> remove(E element);

    HyMutableIterator<E> getIterator();
}
