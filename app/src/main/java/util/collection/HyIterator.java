package util.collection;

public interface HyIterator<E> extends HyReadOnlyIterator<E>{
    boolean hasNext();
    E getNext();
    void remove();
}
