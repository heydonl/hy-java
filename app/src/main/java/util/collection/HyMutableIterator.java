package util.collection;

public interface HyMutableIterator<E> extends HyIterator<E> {
    boolean hasNext();
    E getNext();
    void remove();
}
