package util.collection;

public interface HyImmutableIterator<E> extends HyReadOnlyIterator<E>{
    boolean hasNext();
    E getNext();
    void remove();
}
