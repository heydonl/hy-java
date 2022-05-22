package util.collection;

public interface HyImmutableIterator<E> extends HyIterator<E>{
    boolean hasNext();
    E getNext();
}
