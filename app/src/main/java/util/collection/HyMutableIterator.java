package util.collection;

public interface HyMutableIterator<E> extends HyReadOnlyIterator<E> {
    boolean hasNext();

    E getNext();

    void remove();
}
