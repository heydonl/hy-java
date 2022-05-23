package util.collection;

public interface HyReadOnlyIterator<E> {
    boolean hasNext();

    E getNext();
}
