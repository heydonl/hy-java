package util.collection;

public interface HyMutableCollection<E> extends HyCollection<E> {
    E add(E data);
    E remove(E data);
    HyMutableIterator<E> getIterator();
}
